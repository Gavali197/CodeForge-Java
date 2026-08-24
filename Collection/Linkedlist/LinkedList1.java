package Java.Collection.Linkedlist;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> number = new LinkedList<>();

        number.addFirst(2);
        number.addFirst(3);
        number.addFirst(4);
        number.addFirst(5);

        number.add(6);
        number.add(7);
        // output : [5, 4, 3, 2, 6, 7]


        number.removeFirst();
        number.removeLast();

        number.getFirst();
        number.getLast();

        // output : [4, 3, 2, 6]

        System.out.println(number);
    }
}
