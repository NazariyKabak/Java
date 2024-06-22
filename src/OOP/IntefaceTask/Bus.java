package OOP.IntefaceTask;

public class Bus {
    private String mark;
    private String classification;
    private String classificationLength;
    private String classificationLayout;
    private String classificationTypeEngine;
    private boolean hasAirSuspension;
    private boolean hasAutomaticDoors;
    private boolean hasWheelchairRamp;
    private boolean hasCargoSafetyBelts;

    public Bus(String mark, String classification, String classificationLength, String classificationLayout,
               String classificationTypeEngine, boolean hasAirSuspension, boolean hasAutomaticDoors,
               boolean hasWheelchairRamp, boolean hasCargoSafetyBelts) {
        this.mark = mark;
        this.classification = classification;
        this.classificationLength = classificationLength;
        this.classificationLayout = classificationLayout;
        this.classificationTypeEngine = classificationTypeEngine;
        this.hasAirSuspension = hasAirSuspension;
        this.hasAutomaticDoors = hasAutomaticDoors;
        this.hasWheelchairRamp = hasWheelchairRamp;
        this.hasCargoSafetyBelts = hasCargoSafetyBelts;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getClassificationLength() {
        return classificationLength;
    }

    public void setClassificationLength(String classificationLength) {
        this.classificationLength = classificationLength;
    }

    public String getClassificationLayout() {
        return classificationLayout;
    }

    public void setClassificationLayout(String classificationLayout) {
        this.classificationLayout = classificationLayout;
    }

    public String getClassificationTypeEngine() {
        return classificationTypeEngine;
    }

    public void setClassificationTypeEngine(String classificationTypeEngine) {
        this.classificationTypeEngine = classificationTypeEngine;
    }

    public boolean isHasAirSuspension() {
        return hasAirSuspension;
    }

    public void setHasAirSuspension(boolean hasAirSuspension) {
        this.hasAirSuspension = hasAirSuspension;
    }

    public boolean isHasAutomaticDoors() {
        return hasAutomaticDoors;
    }

    public void setHasAutomaticDoors(boolean hasAutomaticDoors) {
        this.hasAutomaticDoors = hasAutomaticDoors;
    }

    public boolean isHasWheelchairRamp() {
        return hasWheelchairRamp;
    }

    public void setHasWheelchairRamp(boolean hasWheelchairRamp) {
        this.hasWheelchairRamp = hasWheelchairRamp;
    }

    public boolean isHasCargoSafetyBelts() {
        return hasCargoSafetyBelts;
    }

    public void setHasCargoSafetyBelts(boolean hasCargoSafetyBelts) {
        this.hasCargoSafetyBelts = hasCargoSafetyBelts;
    }
}
