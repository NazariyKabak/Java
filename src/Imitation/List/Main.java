package Imitation.List;

import Collection.ArrayList.DoublyLinkedList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    public void run() {
//        Object []objects = new Object[]{
//                new Dog("Gucci","Shpiz"),
//                new Schoolboy("Nazar",16),
//                new Manager("Igor",26,40000),
//                new AppleTree(3,"Green")
//        };
//        List<Object> list = new ArrayList<>(List.of(objects));
//        for (Object o : list) {
//            System.out.println(o);
//        }

        DoublyLinkedList list = new DoublyLinkedList();
        list.add( new Dog("Gucci","Shpiz"));
        list.add( new Schoolboy("Nazar",16));
        list.add( new Manager("Igor",26,40000));
        list.add(new AppleTree(3,"Green"));
        list.display();
    }
}
