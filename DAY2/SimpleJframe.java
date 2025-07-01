
import java.awt.event.*;
import javax.swing.*;

public class SimpleJframe {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField txtInput = new JTextField();
        txtInput.setBounds(100, 50, 200, 40);
        frame.add(txtInput);

        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(100, 100, 200, 40);
        frame.add(btnSubmit);

        JLabel lblOutput = new JLabel("Hello");
        lblOutput.setBounds(100, 150, 200, 40);
        frame.add(lblOutput);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                lblOutput.setText(txtInput.getText());
            }

        });
        frame.setVisible(true);
    }
}
