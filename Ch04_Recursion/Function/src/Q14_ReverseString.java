public class Q14_ReverseString {
    // static String reverse(String str) {
    // if (str.length() == 0) {
    // return "";
    // }
    // String oldResult = reverse(str.substring(1));
    // char newResult = str.charAt(0);
    // return oldResult + newResult;
    // }
    static String twoPointer(char[] arr, int left, int right) {
        if (left > right) {
            return new String(arr);
        }
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        return twoPointer(arr, left + 1, right - 1);
    }

    static String reverse(String str) {
        return twoPointer(str.toCharArray(), 0, str.length() - 1);
    }

    public static void main(String[] args) {

        String rev = reverse("Ashish");
        System.out.println(rev);
    }
}
