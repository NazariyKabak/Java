package OOP.Task13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    public void run() {
        Scanner in = new Scanner(System.in);
        Library lib = new Library();
        int n,m;
        do {
            System.out.print("Enter number n and m ");
            n = in.nextInt();
            m = in.nextInt();

        }while (!lib.verify(n, m));
        final int MIN=0;
        final int MAX=10;
        int a[]=Library.genArray(MIN, MAX,n,m);
        System.out.println(Library.toString(a,n,m));
        System.out.print("Min value: "+Library.min(a,n,m)+" max index on value "+Library.maxEvenIndex(a,n,m)+"\n");


    }
}
