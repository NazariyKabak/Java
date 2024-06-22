package Imitation;

import java.util.List;

public class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, String model, int year, int numDoors) {
        super(brand, model, year);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numDoors=" + numDoors +
                '}';
    }
    public class CarDetails extends vehicleDetails {
        @Override
        public String toString() {
            return "CarDetails{" +
                    "brand='" + getBrand() + '\'' +
                    ", model='" + getModel() + '\'' +
                    ", year=" + getYear() +
                    ", numDoors=" + numDoors +
                    '}';
        }

        public String toString(List<String> fields){
            StringBuilder sb = new StringBuilder();
            for (String field : fields) {
                switch (field) {
                    case "brand":
                        sb.append("brand='").append(getBrand()).append('\'').append(", ");
                        break;
                    case "model":
                        sb.append("model='").append(getModel()).append('\'').append(", ");
                        break;
                    case "year":
                        sb.append("year=").append(getYear()).append(", ");
                    case "numDoors":
                        sb.append("numDoors=").append(numDoors).append(", ");
                        break;
                }
            }
            if (sb.length() > 11) {
                sb.setLength(sb.length()-2);
            }
            sb.append("}");
            return sb.toString();
        }
    }
}
