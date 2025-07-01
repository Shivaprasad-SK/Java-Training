
import java.io.IOException;

public class Shutdown {

    public static void main(String[] args) throws IOException {
        // Windows
        Runtime.getRuntime().exec("shutdown -s -t 0");

        // Linux/Unix
        // Runtime.getRuntime().exec("shutdown -h now");
        // macOS
        // Runtime.getRuntime().exec("sudo shutdown -h now");
    }
}
