package OOP.Task16;

import java.util.Scanner;

public class UserList implements Applicable{
    private NodePerson begin;

    public NodePerson getBegin() {
        return begin;
    }
    public UserList(int n){
        System.out.println("Ввод первой записи:");
        begin=new NodePerson(initNode());
        NodePerson current=begin;
        for(int i=0;i<n;i++){
            System.out.println("Ввод "+(i+1) +"-ой записи:");
            current.setNext(new NodePerson(initNode()));
            current=current.getNext();
        }
    }

    Person initNode(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Last Name: ");
        String lastName=sc.nextLine();
        System.out.println("First Name: ");
        String firstName=sc.nextLine();
        System.out.println("age: ");
        int age=sc.nextInt();
        System.out.println("Gender: ");
        char gender=sc.next().charAt(0);
        return new Person(lastName,firstName,age,gender);
    }

    @Override
    public String resultChoise(char gender) {
        StringBuilder result= new StringBuilder();
        NodePerson current=begin;
        while (current!=null){
            if (current.getPerson().getGender()==gender){
                result.append(current.toString());
            }
            current=current.getNext();
        }
        return result.toString();
    }

    @Override
    public String toString() {
        StringBuilder result= new StringBuilder();
        NodePerson current=this.begin;
        while (current!=null){
            result.append(current.toString());
            current=current.getNext();
        }
        return result.toString();
    }
}
