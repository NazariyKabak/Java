package OOP.Task7;

public class Dog extends Aninal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("gav");
    }

    @Override
    public void eat(String...food) {
        for (int i = 0; i < food.length; i++) {
            System.out.println(food[i]);
        }
    }

    @Override
    public String getDescription() {
       return "I am Dog!";
    }
}
