package Imitation.record.Task16;

public record ObjectiveData(int height, int weight, String healthStatus) {

    @Override
    public String toString() {
        return "ObjectiveData{" +
                "height=" + height +
                ", weight=" + weight +
                ", healthStatus='" + healthStatus + '\'' +
                '}';
    }
}
