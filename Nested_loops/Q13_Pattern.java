package Nested_loops;

public class Q13_Pattern {
    public static void main(String[] args) {
        int n = 5;
        int width = 0;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 2 * n - 1; col++) {
                if (col % n == 0 && row == 1) {
                    System.out.print("*");
                } else if (col == n - row + 1 || col == n + row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}