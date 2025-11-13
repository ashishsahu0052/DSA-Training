package logic_building;

import java.util.Scanner;

public class Q11_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two numbers");

        int x = sc.nextInt();
        int y = sc.nextInt();

        /*
         * while (y != 0) {
         * int temp = x;
         * x = y;
         * y = temp % y;
         * 
         * }
         * System.out.println("GCD is :" + x);
         */

        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }

        }
        System.out.println("GCD is :" + x);

    }
}
