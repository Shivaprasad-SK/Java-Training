
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class DbUI extends JFrame {

    public DbUI() {
        this.setTitle("Database Demo");
        this.setSize(800, 600);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblInput = new JLabel("QUerry:");
        lblInput.setBounds(10, 10, 150, 50);
        this.add(lblInput);

        JTextArea txtInput = new JTextArea();
        txtInput.setBounds(10, 60, 750, 200);
        this.add(txtInput);

        JButton btnExecuteUpadate = new JButton("ExecuteUpdate");
        btnExecuteUpadate.setBounds(40, 280, 325, 50);
        this.add(btnExecuteUpadate);

        JButton btnExecuteQuery = new JButton("ExecuteQuery");
        btnExecuteQuery.setBounds(400, 280, 325, 50);
        this.add(btnExecuteQuery);

        JLabel lblOuput = new JLabel("Output:");
        lblOuput.setBounds(10, 350, 150, 20);
        this.add(lblOuput);

        JTextArea txtArea = new JTextArea();
        txtArea.setBounds(10, 370, 750, 100);
        this.add(txtArea);

        this.add(btnExecuteQuery);

        btnExecuteQuery.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                try {
                    Connection con = DriverManager.getConnection("jdbc:sqlite:college.db");
                    Statement stmt = con.createStatement();
                    String query = txtInput.getText();
                    ResultSet rs = stmt.executeQuery(query);

                    txtArea.setText("");
                    // txtArea.append(rs.getMetaData().getColumnCount() + "");
                    for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {

                        txtArea.append(rs.getMetaData().getColumnName(i).toUpperCase() + "\t" + rs.getInt((rs.getMetaData().getColumnName(i))) + "\n");

                    }
                    // while (rs.next()) {
                    //    txtArea.append("\nUSN " + rs.getInt("usn") + "\nName " + rs.getString("name") + "\nMarks " + rs.getFloat("marks"));
                    // }
                } catch (Exception e) {
                }
            }
        });
        btnExecuteUpadate.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                try {
                    Connection con = DriverManager.getConnection("jdbc:sqlite:college.db");
                    Statement stmt = con.createStatement();
                    String query = txtInput.getText();
                    int r = stmt.executeUpdate(query);

                    txtArea.setText(r + " rows affected");

                } catch (Exception e) {
                }
            }
        });

        this.setVisible(true);
    }
}

public class DbDemo {

    public static void main(String[] args) {
        new DbUI();
    }
}
