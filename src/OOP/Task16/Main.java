package OOP.Task16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    public void run() {
        Scanner in = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter number of students: ");
            n = in.nextInt();
        }while (!Library.verify(n));

        UserList list = new UserList(n);
        System.out.println(list.toString());
        char gender = in.next().charAt(0);
        System.out.println(list.resultChoise(gender));
    }
}
