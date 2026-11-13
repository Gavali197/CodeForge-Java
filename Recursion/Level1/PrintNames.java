package Java.Recursion.Level1;

public class PrintNames {
    public static void PrintNameTimes(int n){
        if(n == 0){
            return;
        }
        System.out.println("Jayesh");
        PrintNameTimes(n - 1);
    }
    public static void main(String[] args) {
        PrintNameTimes(3);
    }
}
