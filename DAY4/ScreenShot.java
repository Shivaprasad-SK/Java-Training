
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ScreenShot {

    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            Rectangle screen = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage image = robot.createScreenCapture(screen);
            ImageIO.write(image, "png", new File("screenshot.png"));
            System.out.println("Screenshot taken!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
