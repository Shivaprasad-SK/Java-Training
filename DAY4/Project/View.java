
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class View {

    static ArrayList<Students> database = new ArrayList<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("View Page");
        frame.setSize(500, 550);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblusn = new JLabel("USN:");
        lblusn.setBounds(80, 100, 100, 25);
        frame.add(lblusn);

        JTextField usn = new JTextField("");
        usn.setBounds(180, 100, 200, 25);
        frame.add(usn);

        JButton btnView = new JButton("View");
        btnView.setBounds(180, 150, 90, 25);
        frame.add(btnView);

        btnView.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int myUsn = Integer.parseInt(usn.getText());
                for (Students s : database) {
                    if (s.usn == myUsn) {
                        JTextArea txtArea = new JTextArea("View");
                        txtArea.setBounds(180, 200, 90, 100);
                        frame.add(txtArea);
                        txtArea.setText("USN:" + s.usn + "\nNAME:" + s.name + "\nPHONE:" + s.phone + "\nCITY:" + s.city + "\nGENDER:" + s.gender);
                        // System.out.println("Name:" + s.usn);
                        // System.out.println("Name:" + s.name);
                        // System.out.println("Name:" + s.phone);
                        // System.out.println("Name:" + s.city);
                        // System.out.println("Name:" + s.gender);
                    }
                }
            }
        });
        // database.add(new Students("shiva", 123, 12345, "s", "y"));

        frame.setVisible(true);
    }
}
