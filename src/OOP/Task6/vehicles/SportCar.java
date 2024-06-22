package OOP.Task6.vehicles;

import OOP.Task6.professions.Driver;

public class SportCar extends Car{
    double maxSpeed;

    public SportCar(int power, String manufacturer, String model, String classCar, String weight, Driver driver, double maxSpeed) {
        super(power, manufacturer, model, classCar, weight, driver);
        this.maxSpeed = maxSpeed;
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
