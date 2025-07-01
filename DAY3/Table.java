
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

class Table {

    public static void main(String args[]) {
        JFrame frame = new JFrame("Registration Page");
        frame.setSize(500, 550);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // String[] column = {"USN", "NAME", "MARKS"};
        // String[][] data = {
        //     {"093", "Shiva", "90"},
        //     {"094", "Prasad", "95"},
        //     {"094", "Prakyath", "99"}
        // };
        // JTable table = new JTable(data, column);
        // table.setBounds(50, 50, 250, 200);
        // frame.add(table);

        // JScrollPane sb = new JScrollPane(table);
        // sb.setBounds(50, 50, 250, 300);
        // frame.add(sb);
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("file");
        JMenuItem menuOpen = new JMenuItem("Open");
        JMenuItem menuSave = new JMenuItem("Save");
        JMenuItem menuSaveAs = new JMenuItem("SaveAs");
        JMenuItem menuClose = new JMenuItem("Close");

        menuFile.add(menuOpen);
        menuFile.add(menuSave);
        menuFile.add(menuSaveAs);
        menuFile.add(menuClose);

        JMenu menuEdit = new JMenu("Edit");
        JMenuItem menuUndo = new JMenuItem("Undo");
        JMenuItem menuCut = new JMenuItem("Cut");
        JMenuItem menuCopy = new JMenuItem("Copy");
        JMenuItem menuPaste = new JMenuItem("Paste");
        menuEdit.add(menuUndo);
        menuEdit.add(menuCut);
        menuEdit.add(menuCopy);
        menuEdit.add(menuPaste);

        menuBar.add(menuFile);
        menuBar.add(menuEdit);

        menuOpen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Open is Clicked");
            }
        });
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);

    }
}
