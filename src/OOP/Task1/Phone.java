package OOP.Task1;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println("Calling " + name);
    }
    public String getNumber() {
        return number;
    }
    public void receiveCall(String name, String number) {
        System.out.println("Calling " + name + " " + number);
        System.out.println(getNumber());
    }


    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void sendMessage(String...numbers) {
        System.out.println("Sending  messages:");
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
