
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RegistrationPage {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Page");
        frame.setSize(500, 550);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel usernamelbl = new JLabel("Name:");
        usernamelbl.setBounds(80, 50, 100, 25);
        frame.add(usernamelbl);

        JTextField username = new JTextField("");
        username.setBounds(180, 50, 200, 25);
        frame.add(username);

        JLabel emaillbl = new JLabel("Email:");
        emaillbl.setBounds(80, 100, 100, 25);
        frame.add(emaillbl);

        JTextField email = new JTextField("");
        email.setBounds(180, 100, 200, 25);
        frame.add(email);

        JLabel genderLbl = new JLabel("Gender:");
        genderLbl.setBounds(80, 150, 100, 25);
        frame.add(genderLbl);

        JRadioButton maleGender = new JRadioButton("Male:");
        maleGender.setBounds(180, 150, 100, 25);
        frame.add(maleGender);

        JRadioButton femaleGender = new JRadioButton("Female:");
        femaleGender.setBounds(280, 150, 100, 25);
        frame.add(femaleGender);

        ButtonGroup bt = new ButtonGroup();
        bt.add(maleGender);
        bt.add(femaleGender);

        JLabel passwordlbl = new JLabel("Password:");
        passwordlbl.setBounds(80, 200, 100, 25);
        frame.add(passwordlbl);

        JTextField password = new JTextField("");
        password.setBounds(180, 200, 200, 25);
        frame.add(password);

        JCheckBox rememberme = new JCheckBox("I accept the terms");
        rememberme.setBounds(180, 250, 200, 25);
        frame.add(rememberme);

        JButton btnRegister = new JButton("Register");
        btnRegister.setBounds(180, 300, 90, 25);
        frame.add(btnRegister);

        JButton btnClear = new JButton("Clear");
        btnClear.setBounds(290, 300, 90, 25);
        frame.add(btnClear);
        JTextArea txtDisplay = new JTextArea("Details:\n");
        txtDisplay.setBounds(100, 400, 200, 100);
        frame.add(txtDisplay);

        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                // txtDisplay.setText("Name:" + username.getText() + "\n");
                // txtDisplay.append("Email:" + email.getText() + "\n");
                // String gen;
                // if (maleGender.isSelected()) {
                //     gen = "Male";
                // } else if (femaleGender.isSelected()) {
                //     gen = "Female";

                // } else {
                //     gen = "Gender is not Selected";
                // }
                // txtDisplay.append("Gender:" + gen + "\n");
                // txtDisplay.append("Password:" + password.getText() + "\n");
                // String agree = "Not Agreed";
                // if (rememberme.isSelected()) {
                //     agree = "agreed";
                // }
                // txtDisplay.append(agree + " to the terms");
            }
        });
        // JTable table = new JTable(data, column);
        // table.setBounds(50, 50, 250, 200);
        // frame.add(table);

        // JScrollPane sb = new JScrollPane(table);
        // sb.setBounds(50, 50, 250, 300);
        // frame.add(sb);
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                username.setText("");
                email.setText("");
                password.setText("");
                rememberme.setSelected(false);
                maleGender.setSelected(false);
                femaleGender.setSelected(false);
                txtDisplay.setText("");
            }
        });

        // String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // JComboBox days= new JComboBox(daysOfWeek);
        // days.setBounds(290,350,90,25);
        // frame.add(days);
        frame.setVisible(true);

    }
}
