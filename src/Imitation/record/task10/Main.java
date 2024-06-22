package Imitation.record.task10;

import Imitation.record.task1.Adult;
import Imitation.record.task1.BaseInform;
import Imitation.record.task1.Child;
import Imitation.record.task1.Pensioner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    private void run() {
        Object[] a ={
                new Child(new BaseInform("Dima",'m',2),160),
                new Child(new BaseInform("Vadim",'m',7),160),
                new Adult(new BaseInform("Nazar",'m',21),180),
                new Pensioner(new BaseInform("Oleg",'m',65),160)
        };
        ArrayWrapper<Object> arrayWrapper = new ArrayWrapper<>(a);
        System.out.println(arrayWrapper.toString());
        String s = LibraryGenerics.choise(a,"Child");
        System.out.println(s);
    }
}
