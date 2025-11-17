package Ch02_LogicBuilding;

import java.util.Scanner;

public class Q10_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two numbers");

        int x = sc.nextInt();
        int y = sc.nextInt();

        int lcm = x > y ? x : y;
        int inc = lcm;
        while (true) {
            if (lcm % x == 0 && lcm % y == 0) {
                break;
            }
            lcm += inc;
        }
        System.out.println("LCM is : " + lcm);
        // int lcm = x < y ? x : y;
        // int inc = lcm;
        // while (true) {
        // if (lcm % x == 0 && lcm % y == 0) {
        // break;

        // }
        // lcm = lcm + inc;

        // }
        // System.out.println("LCM is : " + lcm);

    }
}
