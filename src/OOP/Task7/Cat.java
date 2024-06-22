package OOP.Task7;

public class Cat extends Aninal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat's noise");
    }

    @Override
    public void eat(String... food) {
        for (String s : food) {
            System.out.println(s);
        }
    }

    @Override
    public String getDescription() {
        return "Cat's description";
    }
}
