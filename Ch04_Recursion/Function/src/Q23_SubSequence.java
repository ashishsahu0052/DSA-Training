public class Q23_SubSequence {
    static void subSequence(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        // pick
        subSequence(str.substring(1), result + str.charAt(0));
        // not pick
        subSequence(str.substring(1), result);

    }

    public static void main(String[] args) {
        subSequence("amit", "");
    }
}
