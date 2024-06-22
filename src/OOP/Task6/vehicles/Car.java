package OOP.Task6.vehicles;

import OOP.Task6.details.Engine;
import OOP.Task6.professions.Driver;

public class Car extends Engine {
    private String model;
    private String classCar;
    private String weight;
    private Driver driver;

    public Car(int power, String manufacturer, String model, String classCar, String weight, Driver driver) {
        super(power, manufacturer);
        this.model = model;
        this.classCar = classCar;
        this.weight = weight;
        this.driver = driver;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getClassCar() {
        return classCar;
    }

    public void setClassCar(String classCar) {
        this.classCar = classCar;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }



    public void start(){
        System.out.println("Go");
    }
    public void stop(){
        System.out.println("Stop!");
    }
    public void turnRight(){
        System.out.println("Turn Right");
    }
    public void turnLeft(){
        System.out.println("Turn Left");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", classCar='" + classCar + '\'' +
                ", weight='" + weight + '\'' +
                ", driver=" + driver +
                '}';
    }
}
