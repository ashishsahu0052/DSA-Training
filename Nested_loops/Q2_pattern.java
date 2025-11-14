
package Nested_loops;

public class Q2_pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col <= row) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
/*
  
*
**
***
****
*****
 
 */
