package OOP.Task12;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    public void run() {
        Scanner in = new Scanner(System.in);
        Library obj = new Library();
        String call="Ente num";
        int n;
        do {
            System.out.println(call);
            n = in.nextInt();
        }while (!obj.conditionVerify(n));
            in.close();


        double []a = new double[n];
        final double MIN=0;
        final double MAX=10;
        obj.generationArray(MAX,MIN,a);
        System.out.println(Arrays.toString(a));
        obj.ArrayDiv(a);
        System.out.println(Arrays.toString(a));
    }
}
