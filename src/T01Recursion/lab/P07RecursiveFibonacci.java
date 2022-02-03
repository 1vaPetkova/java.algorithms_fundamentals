package T01Recursion.lab;

import java.util.Scanner;

public class P07RecursiveFibonacci {
    public static long[] memoryForFibonacci;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        memoryForFibonacci = new long[n + 1];
        long result = getFibonacci(n);
        System.out.println(result);
    }

    private static long getFibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (memoryForFibonacci[n] != 0) {
            return memoryForFibonacci[n];//if it is already calculated
        }
        return memoryForFibonacci[n] = getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
