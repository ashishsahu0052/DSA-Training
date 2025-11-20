
public class Q9_ArraySyntax {
    public static void main(String[] args) {
        int[] arr = new int[10]; // filled with 0
        int e[] = new int[] { 1, 2, 3, 4 };
        System.out.println(e.toString());// hexa decimal value , ClassName@hashcode

        int h[][] = { { 1, 2, 3 }, { 2, 3, 4 } };
        int n[][] = new int[3][];
        n[0] = new int[10];
        n[1] = new int[10];

        // array traversing

        for (int b : arr) {
            System.out.println(arr[b]);
        }

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.println(n[i][j]);
            }
        }

        for (int brr[] : n) {
            for (int b : brr) {
                System.out.println(b);

            }
        }
    }
}
