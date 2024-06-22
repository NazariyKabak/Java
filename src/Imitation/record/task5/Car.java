package Imitation.record.task5;

public record Car(Cargo cargo, String colour) {
    @Override
    public String toString() {
        return "Car{" +
                "cargo=" + cargo +
                ", colour='" + colour + '\'' +
                '}';
    }
}
