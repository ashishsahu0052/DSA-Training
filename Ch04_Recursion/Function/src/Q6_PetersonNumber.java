public class Q6_PetersonNumber {
    static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    static void peterson(int num, int sum, int org) {
        if (num == 0) {
            if (org == sum) {
                System.out.println("peterson number");
            } else {
                System.out.println("not a peterson number");
            }
            System.out.println();
            return;
        }
        // int newSum = 1;
        int digit = num % 10;
        // while (digit != 0) {
        // newSum = newSum * digit;
        // digit--;
        // }
        int newSum = factorial(digit);
        peterson(num / 10, sum + newSum, org);
    }

    static int peterson(int num, int org) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        int sum = 1;
        // while (digit != 0) {
        // sum = sum * digit;
        // digit--;
        // }
        sum = factorial(digit);

        return sum + peterson(num / 10, org);

    }

    public static void main(String[] args) {
        int org = 145;
        int r = peterson(org, org);
        System.out.println(org == r ? "peterson number" : "not peterrson number");
        peterson(org, 0, org);
    }
}
// peterson num - 1 ,2 , 145 , 40585
