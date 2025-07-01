
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;

class Frames {

    public Frames(ArrayList<Socket> sockets) {
        JFrame frame = new JFrame("Registration Page");
        frame.setSize(500, 550);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btnScreenShot = new JButton("Screen Shot");
        btnScreenShot.setBounds(200, 300, 100, 50);
        frame.add(btnScreenShot);
        btnScreenShot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                synchronized (sockets) {
                    for (Socket socket : sockets) {
                        try {
                            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                            out.println("Send screenshot!");
                        } catch (Exception ex) {
                            System.out.println("Error sending to client: " + ex);
                        }
                    }
                }
            }
        });

        frame.setVisible(true);
    }
}

class EcachClient extends Thread {

    int x = 0;
    private Socket socket;

    public EcachClient(Socket socket, int x) {
        this.socket = socket;
        this.x = x;
    }

    public void run() {
        try {
            DataInputStream dataIn = new DataInputStream(socket.getInputStream());
            int length = dataIn.readInt();
            byte[] bytes = new byte[length];
            dataIn.readFully(bytes);

            BufferedImage image = ImageIO.read(new ByteArrayInputStream(bytes));
            ImageIO.write(image, "png", new File("screenshot" + x + ".png"));
            System.out.println("Screenshot saved as screenshot" + x + ".png");

            socket.close();
            x++;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

public class Server {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(1000);
        ArrayList<Socket> sockets = new ArrayList<>();
        new Frames(sockets);
        int x = 0;
        try {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                synchronized (sockets) {
                    sockets.add(clientSocket);
                }
                new EcachClient(clientSocket, x).start();
                x++;
            }
        } catch (Exception e) {
            System.out.println("Server error: " + e);
        }
        serverSocket.close();
    }
}
