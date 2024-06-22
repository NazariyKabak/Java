package OOP.Task2;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    public void run() {
        Person p1=new Person("Nazar", 21);
        Person p2=new Person();
        p1.move();
        p1.talk();
        p2.move();
        p2.talk("Nazar");
    }
}
