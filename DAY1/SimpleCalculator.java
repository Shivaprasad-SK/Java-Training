
import java.awt.Button;
import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
import java.util.List;

public class SimpleCalculator {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Page");
        frame.setSize(500, 450);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField txtText = new JTextField();
        txtText.setBounds(50, 50, 310, 50);
        frame.add(txtText);

        ActionListener addToTextField = e -> {
            JButton source = (JButton) e.getSource();
            txtText.setText(txtText.getText() + source.getText());
        };
        ActionListener addSymbolToTextField = e -> {
            JButton source = (JButton) e.getSource();
            txtText.setText(txtText.getText() + " " + source.getText() + " ");
        };
        ActionListener Calculate = e -> {
            String lst[] = txtText.getText().split(" ");
            if (lst.length == 2) {
                txtText.setText("Invalid");
            } else {
                try {
                    for (int i = 0; i < lst.length; i += 3) {
                        if (i == 0) {
                            txtText.setText(lst[i]);
                        } else {
                            int num1 = Integer.parseInt(txtText.getText());
                            int num2 = Integer.parseInt(lst[i + 2]);
                            String operator = lst[i + 1];
                            switch (operator) {
                                case "+":
                                    txtText.setText(String.valueOf(num1 + num2));
                                    break;
                                case "-":
                                    txtText.setText(String.valueOf(num1 - num2));
                                    break;
                                case "*":
                                    txtText.setText(String.valueOf(num1 * num2));
                                    break;
                                case "/":
                                    if (num2 != 0) {
                                        txtText.setText(String.valueOf(num1 / num2));
                                    } else {
                                        txtText.setText("Cannot divide by zero");
                                    }
                                    break;
                                default:
                                    txtText.setText("Invalid operator");
                            }
                        }
                    }
                } catch (Exception exp) {
                    txtText.setText("Error in calculation");
                }
            }
        };
        JButton btn7 = new JButton("7");
        btn7.setBounds(50, 120, 70, 50);
        btn7.addActionListener(addToTextField);
        frame.add(btn7);

        JButton btn8 = new JButton("8");
        btn8.setBounds(130, 120, 70, 50);
        btn8.addActionListener(addToTextField);
        frame.add(btn8);

        JButton btn9 = new JButton("9");
        btn9.setBounds(210, 120, 70, 50);
        btn9.addActionListener(addToTextField);
        frame.add(btn9);

        JButton btndivide = new JButton("/");
        btndivide.setBounds(290, 120, 70, 50);
        btndivide.addActionListener(addSymbolToTextField);
        frame.add(btndivide);

        JButton btn4 = new JButton("4");
        btn4.setBounds(50, 180, 70, 50);
        btn4.addActionListener(addToTextField);
        frame.add(btn4);

        JButton btn5 = new JButton("5");
        btn5.setBounds(130, 180, 70, 50);
        btn5.addActionListener(addToTextField);
        frame.add(btn5);

        JButton btn6 = new JButton("6");
        btn6.setBounds(210, 180, 70, 50);
        btn6.addActionListener(addToTextField);
        frame.add(btn6);

        JButton btnMultiply = new JButton("*");
        btnMultiply.setBounds(290, 180, 70, 50);
        btnMultiply.addActionListener(addSymbolToTextField);
        frame.add(btnMultiply);

        JButton btn1 = new JButton("1");
        btn1.setBounds(50, 240, 70, 50);
        btn1.addActionListener(addToTextField);
        frame.add(btn1);

        JButton btn2 = new JButton("2");
        btn2.setBounds(130, 240, 70, 50);
        btn2.addActionListener(addToTextField);
        frame.add(btn2);

        JButton btn3 = new JButton("3");
        btn3.setBounds(210, 240, 70, 50);
        btn3.addActionListener(addToTextField);
        frame.add(btn3);

        JButton btnSubstract = new JButton("-");
        btnSubstract.setBounds(290, 240, 70, 50);
        btnSubstract.addActionListener(addSymbolToTextField);
        frame.add(btnSubstract);

        JButton btn0 = new JButton("0");
        btn0.setBounds(50, 300, 70, 50);
        btn0.addActionListener(addToTextField);
        frame.add(btn0);

        JButton btnClear = new JButton("C");
        btnClear.setBounds(130, 300, 70, 50);
        frame.add(btnClear);

        JButton btnAdd = new JButton("+");
        btnAdd.setBounds(210, 300, 70, 50);
        btnAdd.addActionListener(addSymbolToTextField);
        frame.add(btnAdd);

        JButton btnEqual = new JButton("=");
        btnEqual.setBounds(290, 300, 70, 50);
        btnEqual.addActionListener(Calculate);
        frame.add(btnEqual);

        frame.setVisible(true);
    }
}
