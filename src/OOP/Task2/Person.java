package OOP.Task2;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
    public void talk() {
        System.out.println(name+" talk");
    }
    public void talk(String name) {
       System.out.println(name+" talk");
    }
    public void move(){
        System.out.println(name+" move");
    }

}
