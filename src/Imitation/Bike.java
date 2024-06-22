package Imitation;

import java.util.List;

public class Bike extends Vehicle {

    private int numGears;

    public Bike(String brand, String model, int year, int numGears) {
        super(brand, model, year);
        this.numGears = numGears;
    }

    public int getNumGears() {
        return numGears;
    }

    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "numGears=" + numGears +
                '}';
    }

    public class BikeDetails extends vehicleDetails{
        @Override
        public String toString() {
            return "BikeDetails{" +
                    "brand='" + getBrand() + '\'' +
                    ", model='" + getModel() + '\'' +
                    ", year=" + getYear() +
                    ", numGears=" + numGears +
                    '}';
        }

        public String toString(List<String> fields){
            StringBuilder sb = new StringBuilder();
            for(String field : fields){
                switch(field){
                    case "brand":
                        sb.append("brand='").append(getBrand()).append('\'').append(", ");
                        break;
                    case "model":
                        sb.append("model='").append(getModel()).append('\'').append(", ");
                        break;
                    case "year":
                        sb.append("year=").append(getYear()).append(", ");
                        break;
                    case "numGears":
                        sb.append("numGears=").append(numGears).append(", ");
                        break;
                }
            }
            if (sb.length()>12){
                sb.deleteCharAt(sb.length()-1);

            }
            sb.append("}");
            return sb.toString();
        }
    }
}
