public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2; // avoid overflow

            if(arr[mid] == target) {
                return mid; // element found
            } else if(arr[mid] < target) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 23, 45, 67, 89}; // must be sorted
        int target = 67;

        int result = binarySearch(arr, target);
        if(result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
