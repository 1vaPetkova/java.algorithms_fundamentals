package T01Recursion.lab;

import java.util.Scanner;

public class P04RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        long result = getFactorial(n);
        System.out.println(result);
    }

    private static long getFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}
