package Java.Sorting.BubbleSort;

public class Bubblesort1 {
    public static void SortingEle(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n -1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i -1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

                swapped = true;
            }

            for (int j : arr) {
                System.out.print(" " + j);
            }
            System.out.println( " ");
            
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {16, 30, 15, 2, 5, 1};
        SortingEle(nums);
    }
}
