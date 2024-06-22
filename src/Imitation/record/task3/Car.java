package Imitation.record.task3;

public record Car(Vehicle vehicle, int capacity) {
    @Override
    public String toString() {
        return "Car{" +
                "vehicle=" + vehicle +
                ", capacity=" + capacity +
                '}';
    }
}
