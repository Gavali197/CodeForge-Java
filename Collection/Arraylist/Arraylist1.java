package Java.Collection.Arraylist;

import java.util.ArrayList;

/**
 * Arraylist1
 */
public class Arraylist1 {

    public static void AddString(String s) {
        ArrayList<String> Str = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Str.add(" " + c);
        }

        System.out.println(Str);
    }

    // output : [ H, e, m, a, n, t]

    public static void addNumbers() {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(3);

        num.set(1, 50);
        num.remove(0);

        System.out.println(num);
    }

    public static void main(String[] args) {
        AddString("Hemant");

        // addNumbers();
    }
}