public class Q11_FindInArray {
    static boolean isFound(int arr[], int index, int searchValue) {

        if (arr[index] == searchValue) {
            return true;
        }
        if (index == arr.length - 1) {
            return false;
        }
        return isFound(arr, index + 1, searchValue);

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.println(isFound(arr, 0, 70) ? "found" : "not found");

    }
}
