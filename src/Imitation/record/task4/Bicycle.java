package Imitation.record.task4;

public class Bicycle {
    private Vehicle vehicle;
    private String color;

    public Bicycle(Vehicle vehicle, String color) {
        this.vehicle = vehicle;
        this.color = color;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "vehicle=" + vehicle +
                ", color='" + color + '\'' +
                '}';
    }
}
