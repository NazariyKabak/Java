package Imitation.record.task6;

public class AirPlane {
    private Cargo cargo;
    private String type;

    public AirPlane(Cargo cargo, String type) {
        this.cargo = cargo;
        this.type = type;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AirPlane{" +
                "cargo=" + cargo +
                ", type='" + type + '\'' +
                '}';
    }
}
