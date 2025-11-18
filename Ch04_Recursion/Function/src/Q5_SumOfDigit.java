public class Q5_SumOfDigit {
    static int sumOfDigit(int num) {
        if (num == 0) {
            return 0;
        }

        return sumOfDigit(num / 10) + num % 10;
    }

    static void sumOfDigit(int num, int sum) {
        if (num == 0) {
            System.out.println(sum);
            return;
        }
        sumOfDigit(num / 10, sum + num % 10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigit(32));
        sumOfDigit(32, 0);

    }
}
