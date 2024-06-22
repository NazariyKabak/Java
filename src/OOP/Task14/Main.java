package OOP.Task14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    public void run() {
        Scanner in = new Scanner(System.in);
        int n;
        int m;
        do {
            System.out.println("Enter the number: ");
            n=in.nextInt();
            m=in.nextInt();
        }while (!RectangularMatrix.verify(n, m));
        in.close();
        final int Min=0;
        final int Max=10;
        int[][] a=RectangularMatrix.genMatrix(Max, Min,n,m);
        System.out.println(RectangularMatrix.toString(a));
        RectangularMatrix b = new RectangularMatrix();
        System.out.println(b.min(a) + " "+b.maxOnEvenIndex(a).getResult());
    }
}
