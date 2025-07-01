
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;

public class BasicOperation {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Page");
        frame.setSize(500, 450);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblop1 = new JLabel("Enter operand1:");
        lblop1.setBounds(80, 50, 100, 25);
        frame.add(lblop1);

        JTextField op1 = new JTextField();
        op1.setBounds(180, 50, 200, 25);
        frame.add(op1);

        JLabel lblop2 = new JLabel("Enter Operand 2");
        lblop2.setBounds(80, 100, 100, 25);
        frame.add(lblop2);

        JTextField op2 = new JTextField();
        op2.setBounds(180, 100, 200, 25);
        frame.add(op2);

        JLabel lblResult = new JLabel("Result");
        lblResult.setBounds(80, 150, 100, 25);
        frame.add(lblResult);

        JTextField Result = new JTextField();
        Result.setBounds(180, 150, 200, 35);
        frame.add(Result);

        JButton btnAdd = new JButton("+");
        btnAdd.setBounds(80, 200, 65, 30);
        frame.add(btnAdd);

        JButton btnMinus = new JButton("-");
        btnMinus.setBounds(160, 200, 65, 30);
        frame.add(btnMinus);

        JButton btnMultyply = new JButton("*");
        btnMultyply.setBounds(240, 200, 65, 30);
        frame.add(btnMultyply);

        JButton btnDivide = new JButton("/");
        btnDivide.setBounds(320, 200, 65, 30);
        frame.add(btnDivide);

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int num1 = Integer.parseInt(op1.getText());
                int num2 = Integer.parseInt(op2.getText());
                int val = num1 + num2;
                Result.setText("" + val);
            }

        });
        btnMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int num1 = Integer.parseInt(op1.getText());
                int num2 = Integer.parseInt(op2.getText());
                int val = num1 - num2;
                Result.setText("" + val);
            }

        });
        btnMultyply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int num1 = Integer.parseInt(op1.getText());
                int num2 = Integer.parseInt(op2.getText());
                int val = num1 * num2;
                Result.setText("" + val);
            }

        });
        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    int num1 = Integer.parseInt(op1.getText());
                    int num2 = Integer.parseInt(op2.getText());
                    int val = num1 / num2;
                    Result.setText("" + val);
                } catch (ArithmeticException e) {
                    Result.setText("Division by Zero");
                }
            }

        });

        frame.setVisible(true);
    }
}
