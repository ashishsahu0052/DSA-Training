
package Ch03_Nested_loops;

public class Q3_Pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col < row) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}

/*
*****
 ****
  ***
   **
    * 

 */
