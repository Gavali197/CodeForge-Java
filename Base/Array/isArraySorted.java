package Java.Base.Array;

public class isArraySorted {
    public static boolean CheckArr(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[] arr = { 10, 12, 12, 14, 16, 18 };

        System.out.println(CheckArr(arr));
    }
}
