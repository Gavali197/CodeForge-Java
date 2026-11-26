package Java.Quetions;
import java.util.Set;
import java.util.HashSet;

/**
 * RemoveDuplicate
 */
public class RemoveDuplicate {

    //optimal Approch
    public static boolean DuplicateArr(int[] arr){
        Set<Integer> seen = new HashSet<>();

        for(int num : arr){
            if(seen.contains(num)){
                System.out.print(num);
                System.out.println(" true ");
                return true;
            }
            System.out.print("  Second Line   ");
            seen.add(num);
            System.out.print(num);
            
        }
        System.out.println("false");
        return false;
    }

    //Sorting approch
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

    //brute forces
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
        int[] arr = { 1, 2, 3, 4, 2 };
        // removeSame(arr);
        // sortingRemove(arr);
        DuplicateArr(arr);
    }
}