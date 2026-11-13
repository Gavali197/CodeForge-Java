package Java.Recursion.Level1;

public class SumNumbers {

    public static void Sum(int n, int total){
        if(n == 0){
            System.out.println(total);
            return;
        }

        total += n;
        Sum(n-1, total); 
    }
    public static void main(String[] args) {
        Sum(5, 0);
    }
} 