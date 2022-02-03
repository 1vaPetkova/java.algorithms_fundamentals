package T01Recursion.lab;

public class P06QueensPuzzle {
    public static char[][] board = getStartMatrix();

    public static void main(String[] args) {

        findQueenPositions(0);

    }

    private static void findQueenPositions(int row) {
        if (row == 8) {
            printMatrix();
        } else {
            for (int col = 0; col < 8; col++) {
                if (canPlaceQueen(row, col)) {
                    putQueen(row, col);
                    findQueenPositions(row + 1);
                    removeQueen(row, col);
                }
            }
        }

    }

    private static void removeQueen(int row, int col) {
        board[row][col] = '-';

    }

    private static void putQueen(int row, int col) {
        board[row][col] = '*';
    }

    private static boolean canPlaceQueen(int row, int col) {
        for (int c = 0; c < 8; c++) {
            if (board[row][c] == '*') {
                return false;
            }
        }
        for (int r = 0; r < 8; r++) {
            if (board[r][col] == '*') {
                return false;
            }
        }
        //left up diagonal
        int r = row;
        int c = col;
        while (r >= 0 && c >= 0) {
            if (board[r--][c--] == '*') {
                return false;
            }
        }

        //right up diagonal
        r = row;
        c = col;
        while (r >= 0 && c < 8) {
            if (board[r--][c++] == '*') {
                return false;
            }
        }

        //down left diagonal
        r = row;
        c = col;
        while (r < 8 && c >= 0) {
            if (board[r++][c--] == '*') {
                return false;
            }
        }

        //down right diagonal
        r = row;
        c = col;
        while (r < 8 && c < 8) {
            if (board[r++][c++] == '*') {
                return false;
            }
        }
        return true;
    }

    private static boolean[][] getStartAttachedPositions() {
        boolean[][] pos = new boolean[8][8];
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                pos[r][c] = true;
            }
        }
        return pos;
    }


    private static void printMatrix() {
        for (char[] arr : board) {
            for (char element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static char[][] getStartMatrix() {
        char[][] chars = new char[8][8];
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                chars[r][c] = '-';
            }
        }
        return chars;
    }
}
