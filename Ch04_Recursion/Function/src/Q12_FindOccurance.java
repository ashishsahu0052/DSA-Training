public class Q12_FindOccurance {
    static int[] find(int arr[], int index, int search) {
        return occur(arr, index, search, 0);

    }

    static int[] occur(int[] arr, int index, int search, int count) {
        if (arr.length == index) {
            int result[] = new int[count];
            return result;
        }
        int[] result;
        if (search == arr[index]) {
            result = occur(arr, index + 1, search, count + 1);
            result[count] = index;
        } else {
            result = occur(arr, index + 1, search, count);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 90, 10, 100, 88 };
        int result[] = find(arr, 0, 10);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
