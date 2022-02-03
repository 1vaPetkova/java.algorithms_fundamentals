package T02CombinatorialProblems;

import java.util.Scanner;

public class P04VariationsWithRepetitions {
    static String[] elements;
    static String[] variations;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        elements = scan.nextLine().split("\\s+");
        int slots = Integer.parseInt(scan.nextLine());
        variations = new String[slots];
        variations(0);

    }

    private static void variations(int index) {
        if (index >= variations.length) {
            print();
            return;
        }
        for (int i = 0; i < elements.length; i++) {
                variations[index] = elements[i];
                variations(index + 1);
            }
        }



    private static void print() {
        System.out.println(String.join(" ", variations));
    }
}
