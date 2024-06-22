package Imitation.record.task12;

public class List <T,S> extends Node<T,S>{
    private Node begin=null;

    public List() {
        super(null,null);

    }

    public void addListEnd(Node node) {
        if (begin == null) {
            begin = node;
            return;
        }
        Node current = begin;
        while (current.next!=null){
            current = current.next;
        }
        current.next = new Node(node.obj1, node.obj2);
        current.next.prev=current;
    }

    public String reversToString(){
        Node current = begin;
        while (current.next!=null){
            current = current.next;
        }
        StringBuilder str = new StringBuilder();
        while (current!=null){
            str.append(current.toString()).append(" ");
            current=current.prev;
        }
        return str.toString();
    }
}
