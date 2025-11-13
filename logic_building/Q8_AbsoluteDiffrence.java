package logic_building;

import java.util.Scanner;

public class Q8_AbsoluteDiffrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two numbers");

        int x = sc.nextInt();
        int y = sc.nextInt();

        int diffrence = x - y;
        if (diffrence < 0) {
            diffrence = -diffrence;
        }

        if (diffrence < 10) {
            System.out.println("Small diffrence");
        } else {
            System.out.println("high diffrence");
        }
    }

}
