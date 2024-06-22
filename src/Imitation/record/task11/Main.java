package Imitation.record.task11;

import Imitation.record.task1.Adult;
import Imitation.record.task1.BaseInform;
import Imitation.record.task1.Child;
import Imitation.record.task1.Pensioner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    public void run() {
        Object[] a = {
                new Adult(new BaseInform("Nazar", 'M', 21), 50000),
                new Child(new BaseInform("Bogdan", 'M', 18), 120),
                new Pensioner(new BaseInform("Max", 'M', 70), 20000),
                new Adult(new BaseInform("Vova", 'M', 44), 60000)
        };
        ArrayWrapper wrapper = new ArrayWrapper(a);
        System.out.println(wrapper.toString());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name to update: ");
        String targetName = scanner.nextLine();
        System.out.print("Enter the new name: ");
        String newValue = scanner.nextLine();
        wrapper.updateFirstElement(targetName,newValue);
        System.out.println(wrapper.toString());

    }
}
