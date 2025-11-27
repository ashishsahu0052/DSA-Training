public class Q20_AtoZCombo {
    static void getCombo(int range, String result) {
        if (range == 0) {
            System.out.print(result + " ");
            return;
        }

        for (char c = 'A'; c <= 'Z'; c++) {
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {

                getCombo(range - 1, result + c);
            }
        }

    }

    public static void main(String[] args) {
        int range = 5;
        getCombo(range, "");
    }
}
