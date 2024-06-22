package Imitation.record.Task16;

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

    public void printReverse(){
        Node<K,V> temp = tail;
        while(temp != null){
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node<K,V> temp = head;
        while(temp != null){
            str.append(temp);
            temp = temp.getNext();
        }
        return str.toString();
    }
}
