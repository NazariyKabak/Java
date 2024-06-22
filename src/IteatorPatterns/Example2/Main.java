package IteatorPatterns.Example2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    public void run() {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        for (Integer i : list) {
            if (i==7){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
