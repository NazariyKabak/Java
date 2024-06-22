package Imitation.record.task6;

public class Car {
    private Cargo cargo;
    private String wheels;

    public Car(Cargo cargo, String wheels) {
        this.cargo = cargo;
        this.wheels = wheels;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cargo=" + cargo +
                ", colour='" + wheels + '\'' +
                '}';
    }
}
