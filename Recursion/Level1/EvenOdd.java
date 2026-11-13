public class EvenOdd {
    public static void EvenNum(int[] arr){
        if(arr.length <= 0){
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            EvenNum([i]);
        }
    
    }
    public static void main(String[] args) {
        
    }
}
