import java.util.*;

public class MergeSort {

    private static int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] arr = new int[left.length + right.length];

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }

        return arr;
    }

    public static int[] divide(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = divide(Arrays.copyOfRange(arr, 0, mid));
        int[] right = divide(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static void main(String[] args) {
        int[] arr = {31, 2, 42, 5, 555, 5, 3, 342};

        System.out.println("Original Array: " + Arrays.toString(arr));
        arr = divide(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
