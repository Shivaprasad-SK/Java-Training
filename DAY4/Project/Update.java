
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Update {

    static ArrayList<Students> database = new ArrayList<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Updation Page");
        frame.setSize(500, 550);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel usernamelbl = new JLabel("Name:");
        usernamelbl.setBounds(80, 50, 100, 25);
        frame.add(usernamelbl);

        JTextField username = new JTextField("");
        username.setBounds(180, 50, 200, 25);
        frame.add(username);

        JLabel lblusn = new JLabel("USN:");
        lblusn.setBounds(80, 100, 100, 25);
        frame.add(lblusn);

        JTextField usn = new JTextField("");
        usn.setBounds(180, 100, 200, 25);
        frame.add(usn);

        JLabel lblCity = new JLabel("City:");
        lblCity.setBounds(80, 150, 100, 25);
        frame.add(lblCity);

        JTextField city = new JTextField("");
        city.setBounds(180, 150, 200, 25);
        frame.add(city);

        JLabel lblPhone = new JLabel("Phone:");
        lblPhone.setBounds(80, 200, 100, 25);
        frame.add(lblPhone);

        JTextField phone = new JTextField("");
        phone.setBounds(180, 200, 200, 25);
        frame.add(phone);

        JLabel genderLbl = new JLabel("Gender:");
        genderLbl.setBounds(80, 250, 100, 25);
        frame.add(genderLbl);

        JRadioButton maleGender = new JRadioButton("Male:");
        maleGender.setBounds(180, 250, 100, 25);
        frame.add(maleGender);

        JRadioButton femaleGender = new JRadioButton("Female:");
        femaleGender.setBounds(280, 250, 100, 25);
        frame.add(femaleGender);

        ButtonGroup bt = new ButtonGroup();
        bt.add(maleGender);
        bt.add(femaleGender);

        JButton btnRegister = new JButton("Update");
        btnRegister.setBounds(180, 300, 90, 25);
        frame.add(btnRegister);

        JButton btnClear = new JButton("Clear");
        btnClear.setBounds(290, 300, 90, 25);
        frame.add(btnClear);

        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String name = username.getText();
                int myUsn = Integer.parseInt(usn.getText());
                String myCity = city.getText();
                int myPhone = Integer.parseInt(phone.getText());
                String myGender = "";
                if (maleGender.isSelected()) {
                    myGender = "Male";
                } else if (femaleGender.isSelected()) {
                    myGender = "Female";
                }
                Students sd = new Students(name, myUsn, myPhone, myGender, myCity);

                for (Students s : database) {
                    if (s.usn == sd.usn) {
                        s.name = sd.name;
                        s.phone = sd.phone;
                        s.city = sd.city;
                        s.gender = sd.gender;
                        break;
                    }
                }
                // for (Students s : database) {
                //     System.out.println(s.usn);
                //     System.out.println(s.name);
                //     System.out.println(s.gender);
                //     System.out.println(s.phone);
                //     System.out.println(s.city);
                //     // System.out.println(s);
                // }
            }
        });
        // database.add(new Students("shiva", 123, 12345, "s", "y"));
        frame.setVisible(true);
    }
}
