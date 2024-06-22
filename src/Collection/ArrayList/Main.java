package Collection.ArrayList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run2() {
        List<String> list = new ArrayList<String>();
        list.add("Nazar");
        list.add("Max");
        list.add("Alex");
        Object [] arr= list.toArray();
        for (Object o : arr) {
            System.out.println(o);
        }

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(12);
        ints.add(33);
        ints.add(41);
        ints.add(25);
        ints.add(6);

        Integer[]  intsArr= new Integer[ints.size()];
        ints.toArray(intsArr);
        int sum=0;
        for (int i = 0; i < intsArr.length; i++) {
            sum+=(Integer)intsArr[i];
        }
        System.out.println(sum);


    }

    public void run() {
        List<String> list = new ArrayList<String>();
        list.add("Nazar");
        list.add("Max");
        list.add("Alex");
//        for (String s : list) {
//            System.out.println(s);
//        }
        for (String s : list) {
            System.out.println(s);
        }
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(12);
        ints.add(33);
        ints.add(41);
        ints.add(25);
        ints.add(6);

//        for (int i = 0; i < ints.size(); i++) {
//            if (ints.get(i) % 2 != 0) {
//                ints.remove(i);
//            }
//        }

//        for (Iterator<Integer> iterator = ints.iterator(); iterator.hasNext();) {
//            Integer x = iterator.next();
//            if (x%2!=0){
//                iterator.remove();
//            }
//        }

        ints.sort(Comparator.naturalOrder());
        extracted(ints);
        int index= Collections.binarySearch(ints, 14);
        System.out.println("index: "+index);
        int p= Collections.binarySearch(ints, 34);
        if (p<0){
            System.out.println("insert in: " + ~p);
        }else System.out.println("p " + p);

        ints.removeIf(x -> x%2 != 0);

        extracted(ints);
    }

    private static void extracted(List<Integer> ints) {
        for (Integer anInt : ints) {
            System.out.println(anInt+" ");
        }
    }
    private void run1(){
        double x=2;
        double y=1.8;
        double a= x-y;
        System.out.println(a);
    }
}
