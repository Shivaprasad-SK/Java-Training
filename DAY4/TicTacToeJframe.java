
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TicTacToeJframe {

    char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    char turn = 'X';
    int[][] arr = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 4, 8}, {2, 4, 6}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}};
    JButton[] buttons = new JButton[9];

    public void displayBoard() {
        // System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        // System.out.println("--+--+--");
        // System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        // System.out.println("--+--+--");
        // System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
        JFrame frame = new JFrame("Registration Page");
        frame.setSize(500, 550);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblTurn = new JLabel(String.valueOf("Player " + turn + " turn:"));
        lblTurn.setBounds(200, 50, 100, 20);
        frame.add(lblTurn);

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            int row = i / 3;
            int col = i % 3;
            buttons[i].setBounds(100 + col * 100, 100 + row * 50, 100, 50);
            frame.add(buttons[i]);
        }
        JLabel lblWon = new JLabel("");
        lblWon.setBounds(200, 350, 100, 20);
        frame.add(lblWon);
        for (int i = 0; i < 9; i++) {
            buttons[i].setText(String.valueOf(board[i]));
            final int idx = i;
            buttons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    board[idx] = turn;
                    turn = (turn == 'X') ? 'O' : 'X';
                    lblTurn.setText(String.valueOf("Player " + turn + " turn:"));
                    buttons[idx].setText(String.valueOf(board[idx]));
                    for (int j = 0; j < arr.length; j++) {
                        if (board[arr[j][0]] == board[arr[j][1]] && board[arr[j][1]] == board[arr[j][2]] && board[arr[j][0]] != ' ') {

                            System.out.println("Player " + board[arr[j][0]] + " wins!");
                            lblWon.setText("Player " + board[arr[j][0]] + " wins!");
                            clear();
                        }
                    }
                }
            });
        }
        frame.setVisible(true);

    }

    public void clear() {
        for (int k = 0; k < board.length; k++) {
            board[k] = ' ';
            buttons[k].setText(" ");
        }
    }

    public static void main(String[] args) {
        TicTacToeJframe game = new TicTacToeJframe();
        game.displayBoard();
    }
}
