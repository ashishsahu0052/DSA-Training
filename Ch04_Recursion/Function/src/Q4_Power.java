public class Q4_Power {

    static void power(int num, int pow, int result) {
        if (pow == 0) {
            System.out.println("result :" + result);
            return;
        }
        power(num, pow - 1, result * num);
    }

    static int power(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        return num * power(num, pow - 1);
    }

    public static void main(String[] args) {
        power(2, 5, 1);
        System.out.println(power(2, 5));

    }
}
