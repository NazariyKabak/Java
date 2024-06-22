package Imitation.record.task15;

public record Train(String number, String company, int numberOfCars) {
    @Override
    public String toString() {
        return "Train{" +
                "number='" + number + '\'' +
                ", company='" + company + '\'' +
                ", numberOfCars=" + numberOfCars +
                '}';
    }
}
