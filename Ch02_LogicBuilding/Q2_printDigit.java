package Ch02_LogicBuilding;

public class Q2_printDigit {
    public static void main(String[] args) {
        // int num = 15642;
        // int temp = num;
        // int count = 0;
        // while (temp > 0) {
        // int digit = temp % 10;
        // // System.out.println(digit);
        // temp = temp / 10;
        // count++;
        // }
        // System.out.println(count);

        // int divide_val = (int) Math.pow(10, count - 1);
        // while (num > 0) {
        // int digit = num / divide_val;
        // System.out.println(digit);
        // num = num % divide_val;
        // divide_val = divide_val / 10;
        // }
        // *********************************************************************************************
        // swap digit with position*/

        int num = 35421;
        int position = 0;
        int sum = 0;
        while (num > 0) {
            position++;
            int digit = num % 10;
            // int temp = position;
            sum += position * (int) Math.pow(10, digit - 1);
            num = num / 10;

        }
        System.out.println(sum);

        // ******************************************************************** */
        // swap the first and last digit
    }
}
