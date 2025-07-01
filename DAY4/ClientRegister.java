
import java.io.*;
import java.util.*;
import java.net.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ClientRegister {

    public static void main(String[] args) {
        try {

            Socket clientSocket = new Socket("127.0.0.1", 1000);

            System.out.println("Connected to Server");

            PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);

            // output.println("Shiva");
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
                    String name = username.getText();
                    String emails = email.getText();
                    String gender = "";
                    if (maleGender.isSelected()) {
                        gender = "Male";
                    } else if (femaleGender.isSelected()) {
                        gender = "Female";
                    }
                    String password1 = password.getText();
                    String remember = "";
                    if (rememberme.isSelected()) {
                        remember = "Yes";
                    } else {
                        remember = "No";
                    }

                    ArrayList<String> al = new ArrayList<>();
                    al.add(name);
                    al.add(emails);
                    al.add(gender);
                    al.add(password1);
                    al.add(remember);
                    output.println(al);
                    try {

                        clientSocket.close();
                    } catch (Exception e) {
                        System.out.println("Error");
                    }
                }

            });
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

            frame.setVisible(true);

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}
