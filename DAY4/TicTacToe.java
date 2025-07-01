
import java.util.Scanner;

public class TicTacToe {

    char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

    public void displayBoard() {
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("--+--+--");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("--+--+--");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
        // JFrame frame = new JFrame("Registration Page");
        // frame.setSize(500, 550);
        // frame.setLayout(null);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JButton[] buttons = new JButton[9];
        // for (int i = 0; i < 9; i++) {
        //     buttons[i] = new JButton("");
        //     int row = i / 3;
        //     int col = i % 3;
        //     buttons[i].setBounds(100 + col * 100, 100 + row * 50, 100, 50);
        //     frame.add(buttons[i]);
        // }
        // frame.setVisible(true);
        // for (int i = 0; i < 9; i++) {
        //     buttons[i].setText(String.valueOf(board[i]));
        // }
    }

    public void play() {
        Scanner sc = new Scanner(System.in);
        displayBoard();
        char turn = 'X';
        int[][] arr = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 4, 8}, {2, 4, 6}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}};
        while (true) {
            System.out.println("Player " + turn + ", enter your move(0-8):  ");
            int move = sc.nextInt();
            board[move] = turn;
            displayBoard();
            if (turn == 'X') {
                turn = 'O';
            } else {
                turn = 'X';
            }
            for (int i = 0; i < arr.length; i++) {
                if (board[arr[i][0]] == board[arr[i][1]] && board[arr[i][1]] == board[arr[i][2]] && board[arr[i][0]] != ' ') {

                    System.out.println("Player " + board[arr[i][0]] + " wins!");
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}
