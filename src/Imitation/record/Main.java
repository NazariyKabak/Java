package Imitation.record;

import Imitation.record.task1.*;
import Imitation.record.task2.Employee;
import Imitation.record.task2.Person;
import Imitation.record.task2.Retiree;
import Imitation.record.task2.Student;
import Imitation.record.task3.Bicycle;
import Imitation.record.task3.Car;
import Imitation.record.task3.Vehicle;
import Imitation.record.task5.AirPlane;
import Imitation.record.task5.Cargo;
import Imitation.record.task5.Train;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run1();
    }
    public void run() {
        Object[]a={
                new Child(new BaseInform("Dima",'m',2),80),
                new Child(new BaseInform("Vadim",'m',7),120),
                new Adult(new BaseInform("Nazar",'m',21),15000),
                new Pensioner(new BaseInform("Oleg",'m',64),500)
        };
        System.out.println(LibraryGenerics.toString(a));
        System.out.println(LibraryGenerics.choise(a,"Pensioner"));
    }

    public void run1() {
        Person person1 = new Person("Alice", 30, "Engineer");
        Person person2 = new Person("Bob", 20, "Student");
        Person person3 = new Person("Charlie", 65, "Retired");

        Employee employee1 = new Employee(person1, 50000, "IT");
        Student student1 = new Student(person2, 10, "Gymnasium");
        Retiree retiree1 = new Retiree(person3, 65, 2000);

        Employee employee2 = new Employee(new Person("David", 40, "Manager"), 60000, "HR");
        Student student2 = new Student(new Person("Eva", 22, "Student"), 11.3, "#7");
        Retiree retiree2 = new Retiree(new Person("Frank", 70, "Retired"), 70, 2500);

        Object[] array = {employee1, student1, retiree1, employee2, student2, retiree2};
//        Imitation.record.task2.LibraryGenerics.printArray(array);
//        Imitation.record.task2.LibraryGenerics.printElementsOfType(array,Student.class);
        Imitation.record.task2.LibraryGenerics.filterByType(array,Employee.class);
    }

    public void run2(){
        Object[]a={
                new Car(new Vehicle("Mercedes",4),5),
                new Bicycle(new Vehicle("Comache",2),2)
        };
        System.out.println(Imitation.record.task3.LibraryGenerics.toString(a));
        System.out.println(Imitation.record.task3.LibraryGenerics.printType(a,"Car"));
    }

    public void run3(){
        Object[]a={
                new Imitation.record.task4.Bicycle(new Imitation.record.task4.Vehicle("Comache",2),"red"),
        new Imitation.record.task4.Car(new Imitation.record.task4.Vehicle("KIA",4),5)
        };
        Imitation.record.task4.LibraryGenerics.printType(a, Imitation.record.task4.Car.class);
        Imitation.record.task4.LibraryGenerics.printArray(a);
    }

    public void run4(){
        Object[]a={
            new AirPlane(new Cargo("Boing","white",1000000),"People"),
            new Train(new Cargo("Intercity", "Blaclk",200000),400)
        };

        Imitation.record.task5.LibraryGenerics.printType(a,"Train");
    }

}
