package Imitation;

import java.util.List;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
    public class vehicleDetails{
        @Override
        public String toString() {
            return "VehicleDetails{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", year=" + year +
                    '}';
        }
        public String toString(List<String> fields){
            StringBuilder sb = new StringBuilder();
            for(String field : fields){
                switch (field){
                    case "brand":
                        sb.append("brand='").append(brand).append('\'').append(", ");
                        break;
                    case "model":
                        sb.append("model='").append(model).append('\'').append(", ");
                        break;
                    case "year":
                        sb.append("year='").append(year).append(", ");
                        break;
                }
            }
            if(sb.length() > 14){
                sb.setLength(sb.length() - 2);
            }
            sb.append("}");
            return sb.toString();
        }
    }

}
