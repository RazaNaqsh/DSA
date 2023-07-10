public class NQueens {

    // *This code is just for a subproblem of placing n queens in n rows, without
    // * considering the attacking part
    // * We just place queens in different rows for this sub problem so that they
    // * arent in the same row

    public static void nQueens(char board[][], int row) {
        // Base Case
        if (row == board.length) {
            printBoard(board);
            return;
        }

        for (int j = 0; j < board.length; j++) {

            board[row][j] = 'Q';
            nQueens(board, row + 1);
            board[row][j] = 'x';

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

    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];

        // initialize
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }

        nQueens(board, 0);

    }
}
