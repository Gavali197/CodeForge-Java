package Java.LinkedList;

class node{
    int data;
    node next;

    node(int data){
        this.data = data;
        this.next = null;
    }
}

public class InsertNodeStart {
    node head;

    public void insertNodeBegging(int newData){
        node newNode = new node(newData);

        newNode.next = head;

        head = newNode;
    }

    public  void printList(){
        node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertNodeStart list = new InsertNodeStart();

        list.insertNodeBegging(10);
        list.insertNodeBegging(20);
        list.insertNodeBegging(30);
        list.insertNodeBegging(40);

        list.printList();
    }
}
