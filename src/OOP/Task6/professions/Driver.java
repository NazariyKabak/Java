package OOP.Task6.professions;

public class Driver extends Person {
    private int drivingExp;

    public Driver(String name, int drivingExp) {
        super(name);
        this.drivingExp = drivingExp;
    }
    public int getDrivingExp() {
        return drivingExp;
    }
    public void setDrivingExp(int drivingExp) {
        this.drivingExp = drivingExp;
    }

}
