package logic_building;

public class Q4_RotateNumber {
    public static void main(String[] args) {
        int num = 1234;
        int k = 8;
        // k = k % count ; // to make it in the range so so that it does not go further
        int temp = num;
        int count = 0;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        System.out.println(count);
        int pow = (int) Math.pow(10, count - 1);
        for (int i = 0; i < k; i++) {
            int lastDigit = num % 10;
            lastDigit = lastDigit * pow;
            num = num / 10;
            num = num + lastDigit;
        }
        System.out.println(num);

        /*
         * int rightpart = num % pow( 10 , k)
         * int leftparrt = num / pow(10, r)
         * ressult = rightpart * pow(10 , count -r) + leftpart
         */
    }

}
