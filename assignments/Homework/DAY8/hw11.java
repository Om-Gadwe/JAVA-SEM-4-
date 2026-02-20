package assignments.Homework.DAY8;
import java.util.Scanner;
/*
a 3×3 matrix with values 1 to 9.
create a function place(usme position aur symbol denge) to insert x ya o
create a function check(isme symbol denge) to check whether the given symbol has filled any condition for win(row, column, diagonal)
create a function to check whether the board is full
ek varibale jisse while loop chaleeega gameover true ya false vo initially false kardenge 
while loop tab tak chalega jab tak gameover false hai aur board full nahi hai
ask player for positio of x
call place fucntion to place x at its position 
call check fucntio for x if true declare x as winner and set gameover as true
if board full then khatam loop
ask player for positio of o
call place fucntion to place o at its position 
call check fucntion for o if true declare o as winner and set gameover as true
if board becomes full and gameOver is still false declare Draw
bich bich me board display kar sakte 
 */
public class hw11 {
    static char[][] board = {
            {'1','2','3'},
            {'4','5','6'},
            {'7','8','9'}
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean gameOver = false;
        while (!gameOver && !isBoardFull()) {
            printBoard();
            // Player X
            System.out.print("Player X, enter position (1-9): ");
            int posX = sc.nextInt();
            placeSymbol(posX, 'X');
            if (checkWinner('X')) {
                printBoard();
                System.out.println("Player X Wins!");
                gameOver = true;
                break;
            }
            if (isBoardFull())
                break;
            printBoard();
            // Player O
            System.out.print("Player O, enter position (1-9): ");
            int posO = sc.nextInt();
            placeSymbol(posO, 'O');
            if (checkWinner('O')) {
                printBoard();
                System.out.println("Player O Wins!");
                gameOver = true;
                break;
            }
        }
        if (!gameOver)
            System.out.println("Game is Draw!");
        sc.close();
    }
    // Function using SWITCH CASE
    static void placeSymbol(int position, char symbol) {
        int row = (position - 1) / 3;
        int col = (position - 1) % 3;
        if (board[row][col] != 'X' && board[row][col] != 'O') {
            board[row][col] = symbol;
        } else {
            System.out.println("Position already taken!");
        }
    }
    // Check Winner
    static boolean checkWinner(char symbol) {

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol)
                return true;
        }
        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == symbol &&
                board[1][i] == symbol &&
                board[2][i] == symbol)
                return true;
        }
        // Check diagonals
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol)
            return true;

        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol)
            return true;

        return false;
    }
    // Check if board is full
    static boolean isBoardFull() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != 'X' && board[i][j] != 'O')
                    return false;
            }
        }
        return true;
    }
    // Print Board
    static void printBoard() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2)
                System.out.println("---|---|---");
        }
        System.out.println();
    }
}
