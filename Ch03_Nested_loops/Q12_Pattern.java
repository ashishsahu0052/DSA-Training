
package Ch03_Nested_loops;

public class Q12_Pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= 2 * n - 1; row++) {
            for (int col = 1; col <= n; col++) {
                if (col <= row && row <= n) {
                    System.out.print("*");
                }
                if (row > n && col > row - n) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}

// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
