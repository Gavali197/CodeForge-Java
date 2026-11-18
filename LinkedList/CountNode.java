package Java.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CountNode {
    Node head;

    public void AddNode(int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }
        // FIX 1: Point to the new node, not itself
        curr.next = newNode;
    }

    public void count() {
        int count = 0;
        Node curr = head;

        while (curr != null) {
            // FIX 2: Print curr.data instead of the curr object reference
            System.out.print(curr.data + "->");
            curr = curr.next;
            count++;
        }
        System.out.println("null");
        // Minor formatting fix: Added a space before "Total"
        System.out.println(count + " Total Nodes");
    }
    
    public static void main(String[] args) {
        // FIX 3: Renamed the variable to 'list' to avoid confusion with the Node class
        CountNode list = new CountNode();

       for (int i = 0; i < 10; i++) {
        list.AddNode(i);
       }

        list.count();
    }
}