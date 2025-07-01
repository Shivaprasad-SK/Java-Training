
import java.io.*;
import java.net.*;
import java.util.*;

public class Client {

    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("127.0.0.1", 1000);
            System.out.println("Connected to Server");

            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.print("Enter your message: ");
                String msg = sc.nextLine();
                output.println(msg);

                if (msg.equalsIgnoreCase("exit")) {
                    System.out.println("Client has exited the chat.");
                    break;
                }
                String res = input.readLine();
                if (res == null || res.equalsIgnoreCase("exit")) {
                    System.out.println("Server has exited the chat.");
                    break;
                }
                System.out.println("Message from Server: " + res);
            }
            clientSocket.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
