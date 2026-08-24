package Java.Sorting.BubbleSort;

public class BubbleSort1 {

    public static void Arraylists(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                // Swap only if elements are in the wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Print array after each pass
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();

            // If no swapping happened, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {12, 16, 9, 3, 56, 1};

        Arraylists(a);
    }
}