package Imitation.record.task6;

public class Train {

    private Cargo cargo;
    private int capacity;

    public Train(Cargo cargo, int capacity) {
        this.cargo = cargo;
        this.capacity = capacity;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Train{" +
                "cargo=" + cargo +
                ", capacity=" + capacity +
                '}';
    }
}
