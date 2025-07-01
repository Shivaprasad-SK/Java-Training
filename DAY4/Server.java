
import java.io.*;
import java.net.*;
import java.util.*;

public class Server {

    public static void main(String args[]) {
        try {
            ServerSocket serverSocket = new ServerSocket(1000);
            System.out.println("Server Started...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client is Connected");

            Scanner sc = new Scanner(System.in);
            PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            while (true) {
                String res = input.readLine();
                if (res == null || res.equalsIgnoreCase("exit")) {
                    System.out.println("Client has exited the chat.");
                    break;
                }
                System.out.println("Message from Client: " + res);

                System.out.print("Enter your response: ");
                String msg = sc.nextLine();
                output.println(msg);

                if (msg.equalsIgnoreCase("exit")) {
                    System.out.println("Server has exited the chat.");
                    break;
                }
            }
            clientSocket.close();
            serverSocket.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
