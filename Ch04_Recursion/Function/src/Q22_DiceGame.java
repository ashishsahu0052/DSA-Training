public class Q22_DiceGame {
    static void diceGame(int N, int start, String result) {
        if (start == N) {
            System.out.print(result + ",");
            return;
        }
        if (start > N) {
            return;
        }

        for (int i = 1; i <= 6; i++) {
            diceGame(N, start + i, result + i);

        }

    }

    public static void main(String[] args) {
        diceGame(4, 0, "");
    }

}
