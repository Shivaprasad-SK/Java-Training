
import java.io.IOException;

public class Restart {

    public static void main(String[] args) throws IOException {
        // Windows
        Runtime.getRuntime().exec("shutdown -r -t 0");

        // Linux/Unix
        // Runtime.getRuntime().exec("reboot");
        // macOS
        // Runtime.getRuntime().exec("sudo shutdown -r now");
    }
}
