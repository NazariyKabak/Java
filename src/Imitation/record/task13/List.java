package Imitation.record.task13;

public class List<K,V> extends Node<K,V> {
    private Node<K,V> head;
    private Node<K,V> tail;

    public List() {
        super(null, null);
        this.head = null;
        this.tail = null;
    }

    public void add(K key, V value) {
        Node<K,V> newNode = new Node<>(key,value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
    }
    public void printReverse(){
        Node<K,V> current = head;
        while (current != null){
            System.out.println(current);
            current = current.getPrev();
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node<K, V> current = head;
        while (current != null) {
            result.append(current).append("\n");
            current = current.getNext();
        }
        return result.toString();
    }
}
