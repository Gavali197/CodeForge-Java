package Array;

public class SubArrayWithSum {
    public static void main(String[] args) {
        // int[] arr = {1, 2 , 3, 4};
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum= arr[i];
        }
        System.out.println(sum);
    }
}
