import java.awt.Color;
import javax.swing.*;

public class StudentInfoPage {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Registration Page");
        frame.setSize(500,450);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel usernamelbl = new JLabel("Name:");
        usernamelbl.setForeground(Color.RED);
        usernamelbl.setBounds(80,50,100,25);
        frame.add(usernamelbl);

        JTextField username = new JTextField("Name:");
        username.setForeground(Color.BLUE);
        username.setBounds(180,50,200,25);
        frame.add(username);

        JLabel rollNoLbl = new JLabel("Roll No:");
        rollNoLbl.setForeground(Color.RED);
        rollNoLbl.setBounds(80,100,100,25);
        frame.add(rollNoLbl);

        JTextField rollNo = new JTextField("Email:");
        rollNo.setForeground(Color.BLUE);
        rollNo.setBounds(180,100,200,25);
        frame.add(rollNo);

        JLabel branchLbl = new JLabel("Branch:");
        branchLbl.setForeground(Color.RED);
        branchLbl.setBounds(80,150,100,25);
        frame.add(branchLbl);

        String[] Branches = {"MCA","MBA","M.Tech","B.Tech","CSE","CSBS"};
        JComboBox branch= new JComboBox(Branches);
        branch.setForeground(Color.BLUE);
        branch.setBounds(180,150,200,25);
        frame.add(branch);

        JLabel yearsLbl = new JLabel("Year:");
        yearsLbl.setForeground(Color.RED);
        yearsLbl.setBounds(80,200,100,25);
        frame.add(yearsLbl);

        String[] Years = {"1st", "2nd", "3rd", "4th"};
        JComboBox year= new JComboBox(Years);
        year.setForeground(Color.BLUE);
        year.setBounds(180,200,200,25);
        frame.add(year);

        JButton loginbtn = new JButton("Save");
        loginbtn.setBounds(180,250,90,25);
        frame.add(loginbtn);

        JButton Cancelbtn = new JButton("Reset");
        Cancelbtn.setBounds(290,250,90,25);
        frame.add(Cancelbtn);

        frame.setVisible(true);
    }
}
