package Imitation.record.task14;

public class List <K,V> extends Node<K,V> {
    private Node<K,V> head;
    private Node<K,V> tail;
    public List(){
        super(null,null);
        this.head = null;
        this.tail = null;
    }

    public void add(K key,V value){
        Node<K,V> newNode = new Node<>(key,value);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
    }
    public void printRevers(){
        Node<K,V> current = tail;
        while(current != null){
            System.out.println(current);
            current = current.getPrev();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<K,V> current = head;
        while(current != null){
            sb.append(current);
            current = current.getNext();
        }
        return sb.toString();
    }
}
