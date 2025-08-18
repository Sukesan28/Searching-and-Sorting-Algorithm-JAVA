import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr = {31, 2, 42, 5, 555, 5, 3, 342};
        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {
            int min = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

            // print array after each pass
            System.out.println("Pass " + (i+1) + ": " + Arrays.toString(arr));
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
