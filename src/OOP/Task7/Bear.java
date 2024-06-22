package OOP.Task7;

public class Bear extends Aninal {
    public Bear(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Bear noise");
    }

    @Override
    public void eat(String... food) {
        for (String s : food) {
            System.out.println(s);
        }
    }

    @Override
    public String getDescription() {
        return "Bear description";
    }
}
