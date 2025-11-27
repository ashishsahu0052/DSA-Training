public class Q19_PinCode {
    static void genPincode(int range, String result) {
        if (range == 0) {
            System.out.print(result + " ");
            return;
        }
        // genPincode(range - 1, result + "0");
        // genPincode(range - 1, result + "1");
        // genPincode(range - 1, result + "2");
        // genPincode(range - 1, result + "3");
        // genPincode(range - 1, result + "4");
        // genPincode(range - 1, result + "5");
        // genPincode(range - 1, result + "6");
        // genPincode(range - 1, result + "7");
        // genPincode(range - 1, result + "8");
        // genPincode(range - 1, result + "9");

        for (int i = 0; i <= 9; i++) {
            genPincode(range - 1, result + i);
        }

    }

    public static void main(String[] args) {
        int range = 10;
        // pincode - 0 -9
        genPincode(range, "");
    }
}
