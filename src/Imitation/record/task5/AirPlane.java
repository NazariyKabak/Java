package Imitation.record.task5;

public record AirPlane(Cargo cargo, String type) {
    @Override
    public String toString() {
        return "AirPlane{" +
                "cargo=" + cargo +
                ", type='" + type + '\'' +
                '}';
    }
}
