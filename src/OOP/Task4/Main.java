package OOP.Task4;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    public void run() {
        int A=5;
        int B=10;
        if (A<B){
            printNumbersIncreasing(A,B);
        }else {
            printNumbersDecreasing(A,B);
        }
    }
    public static void printNumbersIncreasing(int A, int B){
        if (A<=B){
            System.out.println(A+" ");
            printNumbersIncreasing(A+1, B);
        }
    }
    public static void printNumbersDecreasing(int A, int B){
        if (A>=B){
            System.out.println(A+" ");
            printNumbersIncreasing(A-1, B);
        }
    }


}
