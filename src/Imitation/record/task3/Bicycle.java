package Imitation.record.task3;

public record Bicycle(Vehicle vehicle, int capacity) {
    @Override
    public String toString() {
        return "Bicycle{" +
                "vehicle=" + vehicle +
                ", capacity=" + capacity +
                '}';
    }
}
