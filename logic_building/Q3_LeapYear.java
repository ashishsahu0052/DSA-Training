package logic_building;

public class Q3_LeapYear {
    public static void main(String[] args) {
        int year = 1900;
        boolean isLeap = false;

        if (year % 4 == 0) {
            isLeap = true;
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }
            }

        } else {
            isLeap = false;
        }

        // isLeap == true ? System.out.println("leap Year"): System.out.println("not a
        // leap year");

        if (isLeap) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }
    }
}

// password validator - length 8 , input does not show , capital letter , one
// symbol , one number , regular expresssion, system.console
// gradinggg system
// absolute diffrence calculator
// sum of digit