public class Q7_Armstrong {
    static int pow(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        return num * pow(num, pow - 1);
    }

    static int digitCount(int num) {
        if (num == 0) {
            return 0;

        }
        return 1 + digitCount(num / 10);
    }

    static boolean isArmstrong(int num, int digit, int org, int sum) {
        if (num == 0) {
            return sum == org;
        }
        int lastdigit = num % 10;
        sum += pow(lastdigit, digit);
        return isArmstrong(num / 10, digit, org, sum);

    }

    static int countArmstrong(int range) {
        if (range == 0) {
            return 0;
        }
        boolean result = isArmstrong(range, digitCount(range), range, 0);
        int c = countArmstrong(range - 1);
        if (result) {
            c++;
        }
        return c;

    }

    public static void main(String[] args) {
        System.out.println(countArmstrong(153));
    }
}
