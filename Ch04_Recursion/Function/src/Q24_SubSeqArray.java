public class Q24_SubSeqArray {
    static void subSeqArray(int arr[], int start, String result) {
        System.out.println(result);
        for (int i = start; i < arr.length; i++) {
            subSeqArray(arr, i + 1, result + arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        subSeqArray(arr, 0, "");
    }
}
