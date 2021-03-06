package T02CombinatorialProblems;

import java.util.Scanner;

public class P01PermutationsWithoutRepetitions_v2 {
    static String[] elements;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        elements = scan.nextLine().split("\\s+");

        permute(0);

    }

    private static void permute(int index) {
        if (index >= elements.length) {
            print();
            return;
        }
        permute(index + 1);
        for (int i = index + 1; i < elements.length; i++) {
            swap(index, i);
            permute(index + 1);
            swap(index, i);
        }
    }

    private static void swap(int first, int second) {
        String temp = elements[first];
        elements[first] = elements[second];
        elements[second] = temp;
    }


    private static void print() {
        System.out.println(String.join(" ", elements));
    }
}
