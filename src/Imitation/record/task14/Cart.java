package Imitation.record.task14;

public record Cart(String type, int capacity, String material) {

    @Override
    public String toString() {
        return "Cart{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                ", material='" + material + '\'' +
                '}';
    }
}
