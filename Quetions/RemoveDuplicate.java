package Java.Quetions;

/**
 * RemoveDuplicate
 */
public class RemoveDuplicate {

    public static boolean sortingRemove(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

                swapped = true;
            }

            for (int j : arr) {
                System.out.print(" " + j);
            }
            System.out.println(" ");

            if (!swapped) {
                break;
            }
        }
        if (arr[0] == arr[1]) {
            System.out.println("true");
            return true;
        }

        System.out.println("false");
        return false;
    }

    public static boolean removeSame(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("true");
                    return true;
                }
            }
        }
        System.out.println("false");
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 1 };
        // removeSame(arr);
        sortingRemove(arr);
    }
}