public class NQueens {

    // *Now we consider the safety of queen, so we implement an isSafe function
    // *And we have to check only above three directions: up, diagonal left up,
    // *diagonal right up

    // *And this code works for final nqueens which prints all possible solutions.

    public static boolean isSafe(char board[][], int row, int col) {
        // Check up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }

        // check diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // check diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }

    public static void nQueens(char board[][], int row) {
        // Base Case
        if (row == board.length) {
            // printBoard(board);
            count++;
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1); // recursion step
                board[row][j] = 'x'; // backtracking step
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("----------Chess board-----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];

        // initialize
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
        System.out.println("Total ways to solve n queens: " + count);
    }
}
