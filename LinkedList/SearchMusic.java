package Java.LinkedList;

/**
 * InnerSearchMusic
 */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SearchMusic {
    Node head;

    // YOUR TASK: Fill in this method
    public boolean search(int targetValue) {

        // 1. Start at the beginning of the list
        Node current = head;

        // 2. Keep walking as long as there are nodes left
        while (current != null) {
            // 3. Check if the current node holds the target value
            if (current.data == targetValue) {
                return true; // Found it!
            }
            // Move to the next node
            current = current.next;
        }

        // 4. Reached the end (null) without finding it
        return false;
    }

    // Helper to add nodes to the end
    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        SearchMusic playlist = new SearchMusic();

        // Adding Track IDs to the playlist
        playlist.insertAtEnd(101);
        playlist.insertAtEnd(205);
        playlist.insertAtEnd(310);

        // Testing your method
        System.out.println("Finding 205: " + playlist.search(205)); // Should print true
        System.out.println("Finding 404: " + playlist.search(404)); // Should print false
    }
}