
/**
* *******************************************************
*
* Question 1 about coding TicTacToe was answered.
*
* Multiplayer TicTacToe in Java using Java's
* javax.swing package in order to implement
* GUI elements. This game is entirely application-based/
* all graphical.
*
* @author Syed Murtaza Shah
*/

import javax.swing.*; // JCompoments
import javax.swing.border.*; // object borders
import java.awt.*; // LayoutManagers/Fonts
import java.awt.event.*; // ActionListeners
import javax.swing.JTextField; // textfield features

public class TTTGame extends JFrame implements ActionListener {
    // Initialize variables needed
    static int totalCounter = 0;
    static int whichPlayerStarts = 0;
    static int count = 0;
    static int countX = 0;
    static int countO = 0;
    static String currPlr = "X";
    static int[][] board = { { -1, -1, -1 },
            { -1, -1, -1 },
            { -1, -1, -1 } };

    // Declare GUI elements needed
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, newGame, exit;
    JLabel playerX, playerO;
    JTextField xScore, oScore;

    TTTGame() {

        // Formatting the application window
        Font labelFont = new Font("Times New Roman", Font.ITALIC, 30);

        playerX = new JLabel("Player X:");
        playerO = new JLabel("Player O:");
        playerX.setFont(labelFont);
        playerO.setFont(labelFont);
        playerX.setHorizontalAlignment(SwingConstants.CENTER);
        playerO.setHorizontalAlignment(SwingConstants.CENTER);

        xScore = new JTextField(String.valueOf(countX), 23);
        xScore.setEditable(false);
        oScore = new JTextField(String.valueOf(countO), 23);
        oScore.setEditable(false);
        xScore.setHorizontalAlignment(JTextField.CENTER);
        oScore.setHorizontalAlignment(JTextField.CENTER);
        xScore.setFont(labelFont);
        oScore.setFont(labelFont);

        playerX.setForeground(Color.RED);
        playerO.setForeground(Color.BLUE);
        xScore.setForeground(Color.RED);
        oScore.setForeground(Color.BLUE);

        JPanel x_info = new JPanel();
        x_info.setLayout(new BorderLayout(4, 4));
        x_info.add("West", playerX);
        x_info.add("East", xScore);

        JPanel o_info = new JPanel();
        o_info.setLayout(new BorderLayout(4, 4));
        o_info.add("West", playerO);
        o_info.add("East", oScore);

        JPanel all_info = new JPanel();
        all_info.setLayout(new GridLayout(2, 1));
        all_info.add(x_info);
        all_info.add(o_info);
        all_info.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GRAY, Color.GRAY));

        Font btnFont1 = new Font("Times New Roman", Font.PLAIN, 30);
        newGame = new JButton("New Game");
        exit = new JButton(" Exit ");
        newGame.setFont(btnFont1);
        exit.setFont(btnFont1);

        JPanel btn_panel = new JPanel();
        btn_panel.setLayout(new BorderLayout(25, 25));
        btn_panel.add("West", newGame);
        btn_panel.add("East", exit);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        setSize(700, 850);
        setTitle("Tic Tac Toe");

        Font btnFont2 = new Font("Tahoma", Font.BOLD, 230);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_1);
        panel_1.setLayout(new BorderLayout(0, 0));

        b1 = new JButton("");
        b1.setFont(btnFont2);
        b1.setBackground(Color.BLACK);

        panel_1.add(b1, BorderLayout.CENTER);

        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_2);
        panel_2.setLayout(new BorderLayout(0, 0));

        b2 = new JButton("");
        b2.setFont(btnFont2);
        b2.setBackground(Color.BLACK);

        panel_2.add(b2, BorderLayout.CENTER);

        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_3);
        panel_3.setLayout(new BorderLayout(0, 0));
        b3 = new JButton("");
        b3.setFont(btnFont2);
        b3.setBackground(Color.BLACK);
        panel_3.add(b3, BorderLayout.CENTER);

        JPanel panel_4 = new JPanel();
        panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_4);
        panel_4.setLayout(new BorderLayout(0, 0));
        b4 = new JButton("");
        b4.setFont(btnFont2);
        b4.setBackground(Color.BLACK);
        panel_4.add(b4, BorderLayout.CENTER);

        JPanel panel_5 = new JPanel();
        panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_5);
        panel_5.setLayout(new BorderLayout(0, 0));
        b5 = new JButton("");
        b5.setFont(btnFont2);
        b5.setBackground(Color.BLACK);
        panel_5.add(b5, BorderLayout.CENTER);

        JPanel panel_6 = new JPanel();
        panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_6);
        panel_6.setLayout(new BorderLayout(0, 0));
        b6 = new JButton("");
        b6.setFont(btnFont2);
        b6.setBackground(Color.BLACK);
        panel_6.add(b6, BorderLayout.CENTER);

        JPanel panel_7 = new JPanel();
        panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_7);
        panel_7.setLayout(new BorderLayout(0, 0));
        b7 = new JButton("");
        b7.setFont(btnFont2);
        b7.setBackground(Color.BLACK);
        panel_7.add(b7, BorderLayout.CENTER);

        JPanel panel_8 = new JPanel();
        panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_8);
        panel_8.setLayout(new BorderLayout(0, 0));
        b8 = new JButton("");
        b8.setFont(btnFont2);
        b8.setBackground(Color.BLACK);
        panel_8.add(b8, BorderLayout.CENTER);

        JPanel panel_9 = new JPanel();
        panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_9);
        panel_9.setLayout(new BorderLayout(0, 0));
        b9 = new JButton("");
        b9.setFont(btnFont2);
        b9.setBackground(Color.BLACK);
        panel_9.add(b9, BorderLayout.CENTER);

        // implement action listeners to buttons
        newGame.addActionListener(this);
        exit.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        setLayout(new BorderLayout(1, 1));
        add(all_info, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(btn_panel, BorderLayout.SOUTH);
        setVisible(true);
        setLocationRelativeTo(null);
    } // end TTTGame

    /**
     * Takes appropriate measures depending on which button is pressed
     */
    public void actionPerformed(ActionEvent e) {
        // If user wants to reset game, reset value and condition of every variable
        // as needed
        if (e.getSource() == newGame) {
            totalCounter = 0;
            whichPlayerStarts++;
            currPlr = (whichPlayerStarts % 2 == 0) ? "X" : "O";
            b1.setText(null);
            b2.setText(null);
            b3.setText(null);
            b4.setText(null);
            b5.setText(null);
            b6.setText(null);
            b7.setText(null);
            b8.setText(null);
            b9.setText(null);
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = -1;
                } // end for
            } // end for
        } // end if

        if (e.getSource() == exit) {
            whichPlayerStarts = 0;
            JFrame frame = new JFrame("Exit");
            if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Tic Tac Toe",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                System.exit(0);
            } // end if
        } // end if

        if (e.getSource() == b1) {
            b1.setText(currPlr);
            b1.setForeground(Color.WHITE);
            b1.setEnabled(false);
            board[0][0] = (currPlr == "X") ? 1 : 0;
            totalCounter++;
            setCurrPlr();
            checkForWinner();
        } // end if

        if (e.getSource() == b2) {
            b2.setText(currPlr);
            b2.setForeground(Color.WHITE);
            b2.setEnabled(false);
            board[0][1] = (currPlr == "X") ? 1 : 0;
            totalCounter++;
            setCurrPlr();
            checkForWinner();
        } // end if

        if (e.getSource() == b3) {
            b3.setText(currPlr);
            b3.setForeground(Color.WHITE);
            b3.setEnabled(false);
            board[0][2] = (currPlr == "X") ? 1 : 0;
            totalCounter++;
            setCurrPlr();
            checkForWinner();
        } // end if

        if (e.getSource() == b4) {
            b4.setText(currPlr);
            b4.setForeground(Color.WHITE);
            b4.setEnabled(false);
            board[1][0] = (currPlr == "X") ? 1 : 0;
            totalCounter++;
            setCurrPlr();
            checkForWinner();
        } // end if

        if (e.getSource() == b5) {
            b5.setText(currPlr);
            b5.setForeground(Color.WHITE);
            b5.setEnabled(false);
            board[1][1] = (currPlr == "X") ? 1 : 0;
            totalCounter++;
            setCurrPlr();
            checkForWinner();
        } // end if

        if (e.getSource() == b6) {
            b6.setText(currPlr);
            b6.setForeground(Color.WHITE);
            b6.setEnabled(false);
            board[1][2] = (currPlr == "X") ? 1 : 0;
            totalCounter++;
            setCurrPlr();
            checkForWinner();
        } // end if

        if (e.getSource() == b7) {
            b7.setText(currPlr);
            b7.setForeground(Color.WHITE);
            b7.setEnabled(false);
            board[2][0] = (currPlr == "X") ? 1 : 0;
            totalCounter++;
            setCurrPlr();
            checkForWinner();
        } // end if

        if (e.getSource() == b8) {
            b8.setText(currPlr);
            b8.setForeground(Color.WHITE);
            b8.setEnabled(false);
            board[2][1] = (currPlr == "X") ? 1 : 0;
            totalCounter++;
            setCurrPlr();
            checkForWinner();
        } // end if

        if (e.getSource() == b9) {
            b9.setText(currPlr);
            b9.setForeground(Color.WHITE);
            b9.setEnabled(false);
            board[2][2] = (currPlr == "X") ? 1 : 0;
            totalCounter++;
            setCurrPlr();
            checkForWinner();
        } // end if
    } // end ActionPerformed()

    /**
     * Checks if there is a winner, if so, takes appropriate action to prevent
     * further playing
     */
    private void checkForWinner() {
        // Initialize variables needed
        int counter_x_rows = 0;
        int counter_x_cols = 0;
        int counter_o_rows = 0;
        int counter_o_cols = 0;

        // Check if X has won in rows or columns
        for (int i = 0; i < 3; i++) {
            counter_x_rows = 0;
            counter_x_cols = 0;

            for (int j = 0; j < 3; j++) {
                counter_x_rows += (board[i][j] == 1) ? 1 : 0;
                counter_x_cols += (board[j][i] == 1) ? 1 : 0;

                if (counter_x_rows == 3 || counter_x_cols == 3) {
                    countX++;
                    xScore.setText(String.valueOf(countX));
                    winningProcedures("X");
                    return;
                } // end if
            } // end for
        } // end for

        // Check if X has won diagonally
        if ((board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1)
                || (board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1)) {
            countX++;
            xScore.setText(String.valueOf(countX));
            winningProcedures("X");
            return;
        } // end if

        // Check if O has won in rows or columns
        for (int i = 0; i < 3; i++) {
            counter_o_rows = 0;
            counter_o_cols = 0;
            for (int j = 0; j < 3; j++) {
                counter_o_rows += (board[i][j] == 0) ? 1 : 0;
                counter_o_cols += (board[j][i] == 0) ? 1 : 0;
                if (counter_o_rows == 3 || counter_o_cols == 3) {
                    countO++;
                    oScore.setText(String.valueOf(countO));
                    winningProcedures("O");
                    return;
                } // end if
            } // end for
        } // end for

        // Check if O has won diagonally
        if ((board[0][0] == 0 && board[1][1] == 0 && board[2][2] == 0)
                || (board[0][2] == 0 && board[1][1] == 0 && board[2][0] == 0)) {
            countO++;
            oScore.setText(String.valueOf(countO));
            winningProcedures("O");
            return;
        } // end if

        // Else it is a Draw
        if (totalCounter == 9) {
            JFrame frame = new JFrame("Tie Game");
            JOptionPane.showMessageDialog(frame, "It is a draw!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        } // end if
    } // end checkForWinner()

    /**
     * Determines which player's turn it is (X or O)
     */
    private void setCurrPlr() {
        if (currPlr == "X") {
            currPlr = "O";
        } else {
            currPlr = "X";
        } // end if
    } // end setCurrPlr()

    /**
     * carries out the procedure that follows right after someone has won by
     * disabling playing buttons and displaying a pop-up.
     *
     * @param player String - the player "X" or "O" who won the game
     */
    private void winningProcedures(String player) {
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);

        JFrame frame = new JFrame("Winner");
        JOptionPane.showMessageDialog(frame, "Player " + player + " Wins!", "Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
    } // end winningProcedures()

    // MAIN
    public static void main(String[] args) {
        // Instantiate the TTTGame class
        new TTTGame();
    } // end main
} // end program