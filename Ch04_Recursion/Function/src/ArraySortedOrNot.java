public class ArraySortedOrNot {
    static boolean isSorted(int arr[], int index) {
        // base cse
        if (index == arr.length - 1) {
            return true;
        }
        // negative case
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 30, 40 };
        System.out.println(isSorted(arr, 0) ? "sorted" : "not sorted");
    }
}
