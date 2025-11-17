
package Ch03_Nested_loops;

public class Q8_Pattern {
    public static void main(String[] args) {
        int n = 5;
        int flag = 1;
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n; col++) {

                if (col <= row) {
                    System.out.print(flag + "\t");
                    flag++;
                }

            }
            System.out.println();
        }
    }
}

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
