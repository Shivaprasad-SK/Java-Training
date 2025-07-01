
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Test {

    public static void main(String[] args) throws IOException {
        PrintWriter output = new PrintWriter(System.out, true);
        output.println("Enter your Messages");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String msg = input.readLine();
        output.println("You Typed " + msg);

    }
}
