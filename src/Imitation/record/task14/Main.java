package Imitation.record.task14;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    private void run() {
        List<Object,Object> list = new List<>();
        list.add(new Car("Toyota", "Corolla", 2020), new Owner("John Doe", "123 Elm St", "555-1234"));
        list.add(new Bicycle("Giant", "Mountain", 18), new Type("Sport", "Mountain bike", false));
        list.add(new Cart("Horse-drawn", 500, "Wood"), new Registration("12345", "NY", "2025-12-31"));
        list.add(new Car("Honda", "Civic", 2019), new Owner("Jane Smith", "456 Oak St", "555-5678"));
        list.add(new Bicycle("Trek", "Road", 21), new Type("Racing", "Road bike", false));
        list.add(new Cart("Electric", 300, "Metal"), new Registration("67890", "CA", "2024-06-30"));

        list.printRevers();
    }
}
