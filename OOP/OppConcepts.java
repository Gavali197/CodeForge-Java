package Java.OOP;

public class OppConcepts {
    public static void main(String[] args) {
        String str = "Hello";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            System.out.print(" " + c);
        }
   }
}
