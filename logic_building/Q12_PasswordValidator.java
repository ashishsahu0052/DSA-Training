package logic_building;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q12_PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regEx = "^(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z0-9]).{8,25}$";
        String password = sc.next();

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("password is valid");
        } else {
            System.out.println("password is invalid");
        }

    }

}
