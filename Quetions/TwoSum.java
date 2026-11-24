package Java.Quetions;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSumBruteForce(int[] arr, int tar) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == tar) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int tar = 9;
        System.out.println(Arrays.toString(twoSumBruteForce(arr, tar)));
    }
}