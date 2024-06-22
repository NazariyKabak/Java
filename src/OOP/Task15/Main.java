package OOP.Task15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    public void run() {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter number of students: ");
             n = sc.nextInt();
        }
        while (library.verify(n));
        Person []arr = library.generateArray(n);
        System.out.println("DB");
        library.display(arr);
        int minAge= Integer.parseInt(sc.next());
        int maxAge= Integer.parseInt(sc.next());
        sc.close();
        Library.resultChoice(arr, minAge, maxAge);
    }
}
