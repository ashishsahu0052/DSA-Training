package logic_building;

import java.util.Scanner;

public class Q6_Grading_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total marks of the student:");
        int marks = sc.nextInt();
        char grade = ' ';
        // grading system

        if (marks <= 100 && marks >= 90)
            grade = 'A';
        else if (marks >= 80 && marks < 90)
            grade = 'B';
        else if (marks >= 70 && marks < 80)
            grade = 'C';
        else if (marks >= 60 && marks < 70)
            grade = 'D';
        else if (marks < 60)
            grade = 'F';

        System.out.println("Grade of the student is : " + grade);
    }
}
