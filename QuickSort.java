public class QuickSort {
    private static void Quick(int []arr,int low,int high){
        if(low < high){
            int pivot = PivotIndex(arr, low, high);
            Quick(arr, low, pivot - 1);
            Quick(arr, pivot + 1, high);
        }
    }

    private static int PivotIndex(int []nums, int low, int high){
        int pivot = nums[high];   // pivot element
        int i = low - 1;          // smaller element index

        for(int j = low; j < high; j++){
            if(nums[j] < pivot){
                i++;
                // swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        // place pivot at correct position
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int []arr = {31, 2, 42, 5, 555, 5, 3, 342};
        Quick(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
