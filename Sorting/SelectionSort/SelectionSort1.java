package Java.Sorting.SelectionSort;

public class SelectionSort1 {
    public static void SortItem(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[] arr = { 16, 15, 9, 2, 7, 1 };

        SortItem(arr);
    }
}
