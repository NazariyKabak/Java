package Imitation.record.task13;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    private void run() {
        List<ISBN,TypeBook> books = new List<>();
        List<ISSN,TypeJournal> journals = new List<>();
        List<DOI,NewsPaper> papers = new List<>();
        books.add(new ISBN("978-3-16-148410-0"), new TypeBook("Java Programming", "John Doe", 350));
        books.add(new ISBN("978-0-262-03384-8"), new TypeBook("Effective Java", "Joshua Bloch", 416));
        books.add(new ISBN("978-1-491-91428-0"), new TypeBook("Java: The Complete Reference", "Herbert Schildt", 1248));

        // Добавление журналов
        journals.add(new ISSN("1234-5678"), new TypeJournal("Nature", "Philip Campbell", 1));
        journals.add(new ISSN("8765-4321"), new TypeJournal("Science", "H. Holden Thorp", 2));
        journals.add(new ISSN("1122-3344"), new TypeJournal("IEEE Spectrum", "Susan Hassler", 3));

        // Добавление газет
        papers.add(new DOI("10.1000/182"), new NewsPaper("The New York Times", "A.G. Sulzberger", "Daily"));
        papers.add(new DOI("10.1000/183"), new NewsPaper("The Guardian", "Katharine Viner", "Daily"));
        papers.add(new DOI("10.1000/184"), new NewsPaper("The Washington Post", "Fred Ryan", "Daily"));
        books.printReverse();
    }
}
