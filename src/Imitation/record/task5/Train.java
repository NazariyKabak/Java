package Imitation.record.task5;

public record Train(Cargo cargo, int capacity) {
    @Override
    public String toString() {
        return "Train{" +
                "cargo=" + cargo +
                ", capacity=" + capacity +
                '}';
    }
}
