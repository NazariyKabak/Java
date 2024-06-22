package OOP.Task6.vehicles;

import OOP.Task6.professions.Driver;

public class Lory extends Car{
    private String capacity;

    public Lory(int power, String manufacturer, String model, String classCar, String weight, Driver driver, String capacity) {
        super(power, manufacturer, model, classCar, weight, driver);
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void turnRight() {
        super.turnRight();
    }

    @Override
    public void turnLeft() {
        super.turnLeft();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
