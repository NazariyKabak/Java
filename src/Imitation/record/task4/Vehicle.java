package Imitation.record.task4;

public record Vehicle(String model, int wheels) {

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
