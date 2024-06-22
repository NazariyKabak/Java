package Imitation.record.task14;

public record Bicycle(String brand, String type, int gearCount) {
    @Override
    public String toString() {
        return "Bicycle{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", gearCount=" + gearCount +
                '}';
    }
}
