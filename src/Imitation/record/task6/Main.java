package Imitation.record.task6;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    public void run(){
        Object [] a={
                new Car(new Cargo("Mercedes","black",1_000_000), "4"),
                new Car(new Cargo("KIA","white",1_000_00), "4"),
                new AirPlane(new Cargo("Boing","black",10_000_00), "people"),
                new Train(new Cargo("InterCity","grey",100000),600)
        };
        LibraryGenerics.printType(a,Car.class);

    }
}
