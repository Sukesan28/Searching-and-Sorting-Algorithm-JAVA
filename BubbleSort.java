public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {31, 2, 42, 5, 555, 5, 3, 342};
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped, break
            if (!swapped) break;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
