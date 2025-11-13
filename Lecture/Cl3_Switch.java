package Lecture;

public class Cl3_Switch {
    public static void main(String[] args) {
        System.out.println("1. pizza");
        System.out.println("2.burger");
        System.out.println("drink");
        System.out.println("dessart");

        int choice = 1;

        switch (choice) {
            case 1:
                System.out.println("100");
                break;
            case 2:
                System.out.println("200");
                break;
            default:
                System.out.println("invalid choice");
                break;
        }

    }
}
