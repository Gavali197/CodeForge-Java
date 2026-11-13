package Array;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 13, 5, 6, 18, 30, 9, 2};
        int large = arr[0];
        int secondLarge = arr[0];
       for (int i = 0; i < arr.length; i++) {
            if(large < arr[i]){
                secondLarge = large;
                large = arr[i];
            }
        }
        System.out.println("second large element in array " + secondLarge);
        System.out.println("the large element in array " + large);
    }
}



//   while (arr[i] > large) {
//                 large = arr[i];
//                 // arr[i] = secondLarge;
//             }

//             if (large > arr[i]) {
//                 secondLarge = arr[i];
//             }