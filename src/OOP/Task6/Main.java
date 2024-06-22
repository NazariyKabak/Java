package OOP.Task6;

import OOP.Task6.details.Engine;
import OOP.Task6.professions.Driver;
import OOP.Task6.professions.Person;
import OOP.Task6.vehicles.Car;
import OOP.Task6.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    public void run() {
        Driver driver = new Driver("Nazar", 2);
        Car car = new SportCar(380,"X","Nissan","GTR", "1000", driver, 38);
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();

    }
}
