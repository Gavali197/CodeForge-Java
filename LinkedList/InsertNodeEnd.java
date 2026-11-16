package Java.LinkedList;

/**
 * InnerInsertNodeEnd
 */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class InsertNodeEnd{
    Node head;

    // Method to insert at the end
    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);

        // Step 2: If the list is completely empty, make this the first node
        if (head == null) {
            head = newNode;
            return; // We're done, exit the method
        }

        // Step 3: Traverse to find the last node
        Node current = head;
        // As long as there is another node ahead of us, keep moving
        while (current.next != null) {
            current = current.next; 
        }

        // Step 4: We've reached the last node. Connect it to the new node.
        current.next = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertNodeEnd list = new InsertNodeEnd();
        
        list.insertAtEnd(10); 
        // List: 10 -> null
        
        list.insertAtEnd(20); 
        // List: 10 -> 20 -> null
        
        list.insertAtEnd(30); 
        // List: 10 -> 20 -> 30 -> null

        list.printList();
    }
}