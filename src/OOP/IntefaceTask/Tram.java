package OOP.IntefaceTask;

public class Tram {
    public enum varietyAccording{
        OptimizationOfRoutesSchedules,TrafficManagement,Safety,PassengerConvenience
    }
    private String tram;
    private double speed;
    private String tramLayout;
    private String engineControl;
    private int count;
    private String infrastructure;
    private varietyAccording varietyAccording;

    public Tram(String tram, double speed, String tramLayout, String engineControl, int count, String infrastructure,
                Tram.varietyAccording varietyAccording) {
        this.tram = tram;
        this.speed = speed;
        this.tramLayout = tramLayout;
        this.engineControl = engineControl;
        this.count = count;
        this.infrastructure = infrastructure;
        this.varietyAccording = varietyAccording;
    }

    public String getTram() {
        return tram;
    }

    public void setTram(String tram) {
        this.tram = tram;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getTramLayout() {
        return tramLayout;
    }

    public void setTramLayout(String tramLayout) {
        this.tramLayout = tramLayout;
    }

    public String getEngineControl() {
        return engineControl;
    }

    public void setEngineControl(String engineControl) {
        this.engineControl = engineControl;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getInfrastructure() {
        return infrastructure;
    }

    public void setInfrastructure(String infrastructure) {
        this.infrastructure = infrastructure;
    }

    public Tram.varietyAccording getVarietyAccording() {
        return varietyAccording;
    }

    public void setVarietyAccording(Tram.varietyAccording varietyAccording) {
        this.varietyAccording = varietyAccording;
    }
}
