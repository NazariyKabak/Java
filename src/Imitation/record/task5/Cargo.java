package Imitation.record.task5;

public record Cargo(String model, String colour, int price) {
    @Override
    public String toString() {
        return "Cargo{" +
                "model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
