package Imitation.record.task4;

public class Car {
    private Vehicle vehicle;
    private int capacity;

    public Car(Vehicle vehicle, int capacity) {
        this.vehicle = vehicle;
        this.capacity = capacity;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vehicle=" + vehicle +
                ", capacity=" + capacity +
                '}';
    }
}
