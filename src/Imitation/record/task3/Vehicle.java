package Imitation.record.task3;

public record Vehicle(String model, int wheels) {

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
