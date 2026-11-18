package Java.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

//

public class Linkedlist {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node Third = new Node(30);

        head.next = second;
        second.next = Third;

        Node Current = head;

        while (Current != null) {
            System.out.print(Current.data + "->");
            Current = Current.next;
        }
        System.out.println("null");
    }
}
