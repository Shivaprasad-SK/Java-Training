
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyFrame extends JFrame {

    public MyFrame() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        // JRadioButton btnMale = new JRadioButton("Male");
        // btnMale.setBounds(50, 50, 150, 50);
        // this.add(btnMale);
        // JRadioButton btnFemale = new JRadioButton("FeMale");
        // btnFemale.setBounds(50, 100, 150, 50);
        // this.add(btnFemale);
        // ButtonGroup bg = new ButtonGroup();
        // bg.add(btnMale);
        // bg.add(btnFemale);
        JButton btnDisplay = new JButton("Display");
        btnDisplay.setBounds(50, 175, 120, 40);
        this.add(btnDisplay);
        JTextField output = new JTextField("");
        output.setBounds(50, 225, 120, 40);
        this.add(output);
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        JComboBox cmbDays = new JComboBox(days);
        cmbDays.setBounds(50, 50, 150, 50);
        this.add(cmbDays);
        btnDisplay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                // if (btnMale.isSelected()) {
                //     // output.setText("Male is Selected");
                //     JOptionPane.showMessageDialog(btnDisplay, "Male is selected");
                // } else if (btnFemale.isSelected()) {
                //     // output.setText("Female is Selected");
                //     JOptionPane.showMessageDialog(btnDisplay, "Female is selected");
                // } else {
                //     JOptionPane.showMessageDialog(btnDisplay, "Nothing is selected");
                // }
                // String day = days[cmbDays.getSelectedIndex()];
                String day = cmbDays.getSelectedItem().toString();
                output.setText(day);
            }
        });

        this.setVisible(true);
    }
}

class SwingDemo {

    public static void main(String[] args) {
        // JFrame frame = new JFrame();
        // frame.setSize(400, 400);
        // frame.setLayout(null);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // frame.setVisible(true);
        MyFrame mf = new MyFrame();

    }
}
