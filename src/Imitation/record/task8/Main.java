package Imitation.record.task8;

import Imitation.record.task7.Admin;
import Imitation.record.task7.Developer;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    private void run() {
        Object[] a={
                new Manager(new CompanyEmployee("Nazar",21,2),"Support")
        };
        LibraryGenerics.printType(a, Manager.class);
    }
}
