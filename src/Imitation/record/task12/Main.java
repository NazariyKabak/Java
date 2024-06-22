package Imitation.record.task12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    public void run() {
        List list= new List();
        list.addListEnd(new Node(new ISBN("1111-2222-3333-4444"), new TypeBook("fantasy")));
        list.addListEnd(new Node(new ISSN("0000-9999"), new TypeJournal("sicense")));
        list.addListEnd(new Node(new ISSN("1001-5005"), new Newspaper("NYT")));
        System.out.println(list.reversToString());

    }
}
