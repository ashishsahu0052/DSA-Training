public class Q2_CountEvenOdd {
    static void countEvenOdd(int range, int even, int odd) {
        if (range == 0) {
            System.out.println("even : " + even + " odd : " + odd);
            return;
        }
        if (range % 2 == 0) {
            countEvenOdd(range - 1, even + 1, odd);
        } else {
            countEvenOdd(range - 1, even, odd + 1);
        }

    }

    public static void main(String[] args) {
        countEvenOdd(100, 0, 0);
    }
}
