package Imitation.record.task15;

public record AirPlane(String model, String manufacturer, int hours) {
    @Override
    public String toString() {
        return "AirPlane{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", hours=" + hours +
                '}';
    }
}
