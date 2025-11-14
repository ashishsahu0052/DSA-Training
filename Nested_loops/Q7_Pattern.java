
package Nested_loops;

public class Q7_Pattern {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            char flag = (char) 65;
            for (int col = 1; col <= n; col++) {

                if (col <= row) {
                    System.out.print(flag);
                    flag++;
                }

            }
            System.out.println();
        }
    }
}
/*
 * A
 * AB
 * ABC
 * ABCD
 * ABCDE
 * 
 */
