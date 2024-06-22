package Imitation.record.task7;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    private void run() {
        Object[] a={
            new Developer(new CompanyEmployee("Nazar",21,1),"Java"),
            new Developer(new CompanyEmployee("Bogdan",18,1),"Java"),
            new Admin(new CompanyEmployee("Max",23,1),"Support"),
            new Manager(new CompanyEmployee("Vova",44,20),"Electricity")
        };

        String result=LibraryGenerics.choise(a,"Developer");
        System.out.println(result);

    }
}
