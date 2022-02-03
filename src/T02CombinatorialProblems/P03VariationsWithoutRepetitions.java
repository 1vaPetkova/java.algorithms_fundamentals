package T02CombinatorialProblems;

import java.util.Scanner;

public class P03VariationsWithoutRepetitions {
    static String[] elements;
    static String[] variations;
    static boolean[] used;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        elements = scan.nextLine().split("\\s+");
        int slots = Integer.parseInt(scan.nextLine());
        variations = new String[slots];
        used = new boolean[elements.length];
        variations(0);

    }

    private static void variations(int index) {
        if (index >= variations.length) {
            print();
            return;
        }
        for (int i = 0; i < elements.length; i++) {
            if (!used[i]) {
                used[i] = true;
                variations[index] = elements[i];
                variations(index + 1);
                used[i] = false;
            }
        }

    }

    private static void print() {
        System.out.println(String.join(" ", variations));
    }
}
