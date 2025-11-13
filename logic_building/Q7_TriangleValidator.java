package logic_building;

import java.util.Scanner;

public class Q7_TriangleValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of the triagle:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("it is a valid triangle");
        } else {
            System.out.println("not a cvalid triangle");
        }
    }
}
