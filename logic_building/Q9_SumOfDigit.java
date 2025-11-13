package logic_building;

import java.util.Scanner;

public class Q9_SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number    6");
        int num = sc.nextInt();

        int digit = 0;
        while (num > 0) {
            num /= 10;
            digit++;
        }

        System.out.println("digits :" + digit);
    }
}
