package Java.Base.Array;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 7, 4, 4, 2};
        int curr = arr[0];
        int Majority = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i+1]){
                curr = arr[i];
                Majority = curr;
            }else{
                curr = arr[i];
            }
        }

        System.out.println(Majority);
    }
}
