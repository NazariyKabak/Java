package Collection.ArrayList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public void add(Object data) {
        Node newNode =new Node(data);
        if (head == null) {
            head =tail= newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
