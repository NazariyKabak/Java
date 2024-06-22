package OOP.Task15;

import java.util.Scanner;

public class Library implements Applicable{

    @Override
    public boolean verify(int n) {
        if (n<=0){
            return false;
        }
        return true;
    }

    @Override
    public Person[] generateArray(int n) {
        Scanner sc = new Scanner(System.in);
        Person[] arr = new Person[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            System.out.println("Enter Gender: ");
            char gender = sc.next().charAt(0);
            arr[i] = new Person(name, age, gender);
        }
        return arr;
    }

    @Override
    public void display(Person[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
    }

    public static void resultChoice(Person[] arr, int minAge, int maxAge) {
        int age;
        for (int i = 0; i < arr.length; i++) {
            age = arr[i].getAge();
            if (age > minAge && age < maxAge) {
                System.out.println(arr[i].toString());
            }
        }
    }
}
