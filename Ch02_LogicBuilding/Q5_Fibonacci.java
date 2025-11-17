package Ch02_LogicBuilding;

public class Q5_Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println(c);
            c = a + b;
            a = b;
            b = c;

        }

    }
}
