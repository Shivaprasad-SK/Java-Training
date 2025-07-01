
import java.io.*;
import java.util.*;
import java.net.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ServerRegister {

    public static void main(String args[]) {
        try {

            ServerSocket serverSocket = new ServerSocket(1000);
            System.out.println("Server Started...");
            Socket clienSocket = serverSocket.accept();
            System.out.println("Client is Connected");
            PrintWriter output = new PrintWriter(clienSocket.getOutputStream(), true);

            BufferedReader input = new BufferedReader(new InputStreamReader(clienSocket.getInputStream()));
            String al = input.readLine();
            System.out.println(al);
            JFrame frame = new JFrame("Registration Page");
            frame.setSize(500, 550);
            frame.setLayout(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            String[] arr = al.split(",");
            JTextArea txtDisplay = new JTextArea("Details:\n");
            txtDisplay.setBounds(100, 100, 200, 100);
            txtDisplay.setText("Name:" + arr[0] + "\n");
            txtDisplay.append("Email:" + arr[1] + "\n");

            txtDisplay.append("Gender:" + arr[2] + "\n");
            txtDisplay.append("Password:" + arr[3] + "\n");
            String agree = "Not Agreed";
            if (arr[4] == "Yes") {
                agree = "agreed";
            }
            txtDisplay.append(agree + " to the terms");
            frame.add(txtDisplay);
            frame.setVisible(true);
            serverSocket.close();
        } catch (Exception e) {
        }
    }
}
