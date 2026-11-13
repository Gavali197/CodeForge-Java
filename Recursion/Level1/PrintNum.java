package Java.Recursion.Level1;

public class PrintNum {
    public static void PrintNumbers(int n){
        if(n == 0){
            return;
        }
        
        PrintNumbers(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        PrintNumbers(10);
    }
}
