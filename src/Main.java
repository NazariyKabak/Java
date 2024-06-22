import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public void run() {
        int n = 6;
        for (int y = -n; y <= 2 * n; y++) {
            for (int x = -2 * n; x <= 2 * n; x++)
                if ((y <= 0 &&
                        ((int) Math.sqrt((x + n) * (x + n) + y * y) <= n
                                || (int) Math.sqrt((x - n) * (x - n) + y * y) <= n))
                        || (y > 0 && Math.abs(x) <= 2 * n - y))
                    System.out.print("♥ ");
                else
                    System.out.print("♡ ");
            System.out.println();
        }
    }
//    public void run1(){
//        int  a=6;
//        a=7;
//        int b=a;
//        System.out.println(b);
//        int income=100;
//        int strIncome=101;
//        System.out.println(income==strIncome);
//        String num1="100";
//        int num2=1;
//        System.out.println(num1+" "+num2);
//
////        String num3="123gggg";
////        int num4=Integer.parseInt(num3);
////        System.out.println(num4);
//
//        String[] arr ={"Nazar", "Bob","Tom"};
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[1]);
//        arr[0]="Nazariy";
//        System.out.println(Arrays.toString(arr));
////        arr[3]="MAx";
////        System.out.println(Arrays.toString(arr));
//        Object [][] arr2 ={{"Nazar","Bob","Tom"},{1,2,3}};
//        Object[] arr3={"Nazar",1,'c'};;
//        for (Object o : arr3) {
//            System.out.println(o);
//        }
//        System.out.println(arr2[1][1]);
//
//        hello();
//        hello();
//        hello();
//
//    }
//    public void hello(){
//        System.out.println("Hello!");
//    }
}
