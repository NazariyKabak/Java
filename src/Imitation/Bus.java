package Imitation;

import java.util.List;

public class Bus extends Vehicle {

    private int capacity;

    public Bus(String brand, String model, int year, int capacity) {
        super(brand, model, year);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "capacity=" + capacity +
                '}';
    }
    public class BusDetails extends vehicleDetails{
        @Override
        public String toString() {
            return "Bus{" +
                    "brand='" + getBrand() + '\'' +
                    ", model='" + getModel() + '\'' +
                    ", year=" + getYear() +
                    ", seatingCapacity=" + capacity +
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
                        break;
                    case "capacity":
                        sb.append("capacity=").append(capacity).append(", ");
                        break;

                }

            }
            if (sb.length() > 12) {
                sb.deleteCharAt(sb.length()-1);

            }
            sb.append('}');
            return sb.toString();
        }
    }
}
