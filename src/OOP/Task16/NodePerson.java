package OOP.Task16;

public class NodePerson {
    private Person person;
    private NodePerson next = null;

    public NodePerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public NodePerson getNext() {
        return next;
    }

    public void setNext(NodePerson next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodePerson{" +
                "person=" + person +
                '}';
    }
}
