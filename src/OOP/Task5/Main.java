package OOP.Task5;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    public void run() {
        Student []student = new Student[]{new Student("Nazarii", "Kabak","11",5),
        new Aspirant("Igor", "kaifozvir", "12", 5, "Dota2"),
        new Student("Max", "Kard", "13",4)};
        Student a= new Aspirant("yarik","fsds","1",3,"Chipik");
        for (Student student1: student){
            System.out.println(student1.getScholarship());
        }
        System.out.println(a.getScholarship());

    }
}
