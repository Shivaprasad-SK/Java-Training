
import javax.swing.*;

public class Login {
public static void main(String[] args) {
        JFrame frame=new JFrame("Login Page");
        frame.setSize(500,350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel usernamelbl = new JLabel("Username:");
        usernamelbl.setBounds(80,50,100,25);
        frame.add(usernamelbl);

        JTextField username = new JTextField("Username:");
        username.setBounds(180,50,200,25);
        frame.add(username);


        JLabel passwordlbl = new JLabel("Password:");
        passwordlbl.setBounds(80,100,100,25);
        frame.add(passwordlbl);

        JTextField password = new JTextField("********");
        password.setBounds(180,100,200,25);
        frame.add(password);

        JCheckBox rememberme = new JCheckBox("Remember me");
        rememberme.setBounds(180,150,200,25);
        frame.add(rememberme);

        JButton loginbtn = new JButton("Login");
        loginbtn.setBounds(180,200,90,25);
        frame.add(loginbtn);

        JButton Cancelbtn = new JButton("Cancel");
        Cancelbtn.setBounds(290,200,90,25);
        frame.add(Cancelbtn);
        frame.setVisible(true);
    }
}
