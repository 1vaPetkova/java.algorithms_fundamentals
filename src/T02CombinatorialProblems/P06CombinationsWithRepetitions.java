package T02CombinatorialProblems;

import java.util.Scanner;

public class P06CombinationsWithRepetitions {
    static String[] elements;
    static String[] combinations;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        elements = scan.nextLine().split("\\s+");
        int slots = Integer.parseInt(scan.nextLine());
        combinations = new String[slots];
        combinations(0, 0);
    }

    private static void combinations(int index, int start) {
        if (index == combinations.length) {
            print();
            return;
        }
        for (int i = start; i < elements.length; i++) {
            combinations[index] = elements[i];
            combinations(index + 1, i );
        }
    }

    private static void print() {
        System.out.println(String.join(" ", combinations));
    }

}
