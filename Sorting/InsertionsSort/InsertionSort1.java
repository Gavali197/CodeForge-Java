package Java.Sorting.InsertionsSort;

public class InsertionSort1 {
    public  int[] Sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i -1;

            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;

                System.out.print("  " + j);
            }
            
            arr[j+1] = key;
        }
        return arr;
    }
    public static void main(String[] args) { 
        int[] nums = {13, 46, 24, 52, 20, 9};
        
        System.out.println("Before Using Insertion Sort: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Function call for insertion sort
        nums = solution.insertionSort(nums);
        
        System.out.println("After Using Insertion Sort: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
