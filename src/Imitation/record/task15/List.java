package Imitation.record.task15;

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
            current = current.getNext();
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node<K,V> current = head;
        while(current != null){
            str.append(current);
            current = current.getNext();
        }
        return str.toString();
    }
}
