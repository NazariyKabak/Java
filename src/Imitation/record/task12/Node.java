package Imitation.record.task12;

public class Node <T,S>{
    protected Node prev;
    protected T obj1;
    protected S obj2;

    protected Node next=null;
    public Node(T obj1, S obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public String toString() {
        return "Node{" +
                "obj1=" + obj1 +
                ", obj2=" + obj2 +
                ", next=" + next +
                '}';
    }
}
