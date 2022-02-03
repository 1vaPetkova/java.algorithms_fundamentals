package T01Recursion.lab;

import java.util.Scanner;

public class P05FindAllPathsInALabyrinth {
    static StringBuilder path = new StringBuilder();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());
        char[][] labyrinth = readNewMatrix(scan, rows, cols);

        findPath(labyrinth, 0, 0, ' ');

    }

    private static void findPath(char[][] labyrinth, int row, int col, char direction) {
        if (isOutOfBounds(labyrinth, row, col)
                || labyrinth[row][col] == 'V'
                || labyrinth[row][col] == '*') {
            return;
        }

        path.append(direction);

        if (labyrinth[row][col] == 'e') {
            printPath();
            path.deleteCharAt(path.length() - 1);
            return;
        }

        labyrinth[row][col] = 'V';

        findPath(labyrinth, row - 1, col, 'U');
        findPath(labyrinth, row + 1, col, 'D');
        findPath(labyrinth, row, col - 1, 'L');
        findPath(labyrinth, row, col + 1, 'R');

        labyrinth[row][col] = '-'; // backtracking
        path.deleteCharAt(path.length() - 1);
    }

    private static void printPath() {
        System.out.println(path.substring(1));
    }

    private static boolean isOutOfBounds(char[][] labyrinth, int row, int col) {
        return row < 0 || row >= labyrinth.length || col < 0 || col >= labyrinth[row].length;
    }

    private static char[][] readNewMatrix(Scanner scan, int rows, int cols) {
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = scan.nextLine().toCharArray();
        }
        return matrix;
    }
}
