package OOP.Task3;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    public void run() {
        Reader [] readers=new Reader[2];
        readers[0]= new Reader("Nazar", 11,"Programing",2002,"098040");
        readers[1]= new Reader("Taras", 12,"Programing",2002,"0480340");
        readers[0].takeBook(3);
        readers[0].takeBook("Приключения", "Словарь", "Энциклопедия");
        readers[0].takeBook(new Book("Приключения", "Автор1"),
                new Book("Словарь", "Автор2"),
                new Book("Энциклопедия", "Автор3")
        );
        readers[0].returnBook(2);
    }
}
