package T01Recursion.lab;

import java.util.Scanner;

public class P02RecursiveDrawing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        printDrawing(n);
    }

    private static void printDrawing(int n) {
        if (n == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        printDrawing(n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print("#");
        }
        System.out.println();
    }
}
