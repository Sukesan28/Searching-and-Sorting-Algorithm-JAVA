public class InsertionSort {
    public static void main(String[] args) {
        int []arr = {31, 2, 42, 5, 555, 5, 3, 342};
        int n = arr.length;

        for(int i = 1; i < n; i++) {   // start from 1
            int key = arr[i];
            int j = i - 1;

            // shift elements greater than key
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;  // place key at correct position
        }

        // print result
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
