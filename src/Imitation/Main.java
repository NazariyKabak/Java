package Imitation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public void run() {
        List<Vehicle> vehicles = new ArrayList<>(List.of(
                new Bike("Ducatti","11",2019,2),
                new Bus("Bogdan","X3",2002,24),
                new Car("Mercedes","AMG",2021,4)
        ));

    }



    public static void printVehicle(List<Vehicle> vehicles, boolean reverse) {
        if (reverse){
            Collections.reverse(vehicles);
        }
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }
        if (reverse){
            Collections.reverse(vehicles);
        }
    }

    public static void printSelectedFields(List<Vehicle> vehicles, List<String> fields,boolean reverse) {
        if (reverse){
            Collections.reverse(vehicles);
        }
        for (Vehicle vehicle : vehicles){
            Vehicle.vehicleDetails details;
            if (vehicle instanceof Car){
                details=((Car) vehicle).new CarDetails();
            }else if (vehicle instanceof Bike){
                details = ((Bike) vehicle).new BikeDetails();
            } else if (vehicle instanceof Bus) {
                details = ((Bus) vehicle).new BusDetails();
            }else {
                details = vehicle.new vehicleDetails();
            }
            System.out.println(details.toString(fields));
        }
        if (reverse){
            Collections.reverse(vehicles);
        }
    }

    /**
     * Написать метод, добавляющий один элемент списка (в середину или конец)
     * после первого по порядку элемента,
     * у которого совпадает значение четвертого поля со введенным с клавиатуры значением;
     **/

    private void task1(List<Item> list, int valueToCompare, Item newItem) {
        for (int i = 0; i < list.size(); i++) {
            Item currentItem = list.get(i);
            if (currentItem.getField4() == valueToCompare) {
                list.add(i + 1, newItem);
                return;
            }
        }
        System.out.println("Element not found");
    }

    private void task2(List<Integer> list, int valueToCompare, Integer newItem) {
        for (int i = 4; i < list.size(); i += 5) {
            if (list.get(i) == valueToCompare) {
                list.add(i + 1, newItem);
                return;
            }
        }
        System.out.println("Element not found");
    }

    public void task3(List<Integer> list, int valueToCompare, Integer newItem) {
        for (int i = 5; i < list.size(); i += 6) {
            if (list.get(i).equals(valueToCompare)) {
                list.add(i + 1, newItem);
                return;
            }
        }
        System.out.println("Element not found");
    }

    public void task4(List<Item> list, int valueToCompare, Item newItem) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getField1() == valueToCompare) {
                list.add(i + 1, newItem);
                return;
            }
        }
        System.out.println("Element not found");
    }

    public void task5(List<Item> list, int valueToCompare) {

        list.removeIf(x -> x.getField1() == valueToCompare);

    }
    public void task6(List<Integer> list, int value){
        if (!list.isEmpty()&&list.get(0) == value){
            list.clear();
            System.out.println("All elements removed from the list.");
        }else{
            System.out.println("First element does not match the input value. No elements removed.");
        }
        System.out.println("Updated list: " + list);
    }


    /**Написать метод, находящий в списке элемент с совпадающим со введенным с клавиатуры значением первого поля
     *  и изменяющим это значение на новое, введенное с клавиатуры.**/
    public void task7(List<Item> list, int value, int item) {
        for (Item item1 : list) {
            if (item1.getField1() == value) {
                item1.setField1(item);
                return;
            }
        }
    }

    public void task8(List<Item> list, int value, int item) {
        for (Item item1 : list) {
            if (item1.getField2() == value) {
                item1.setField2(item);
                return;
            }
        }
    }



    /**Написать метод, находящий в списке элемент с совпадающим
     * со введенным с клавиатуры значением первого поля и изменить значение второго**/
    public void task9(List<Item> list, int value, int item){
        for (Item item1 : list) {
            if (item1.getField1() == value) {
                item1.setField2(item);
                return;
            }
        }
    }

    public void task10(List<Item> list, int value, int item){
        for (Item item1 : list) {
            if (item1.getField4()==value){
                item1.setField5(item);
                return;
            }
        }
    }

    public void task11(List<Person> list, String value, int age){
        for (Person person : list) {
            if (person.getName().equals(value)){
                person.setAge(age);
                return;
            }
        }
    }

    public void task12(List<Person> list, int value, String name){
        for (Person person : list) {
            if (person.getAge()==value){
                person.setName(name);
                return;
            }
        }
    }

    public void task13(List<Person> list, int value, String name, int age){
        for (int i = 0; i < list.size(); i++) {
            Person person = list.get(i);
            if (person.getAge() == value) {
                Person newPerson = new Person(name, age);
                list.set(i, newPerson);
                return;
            }
        }
    }
}
