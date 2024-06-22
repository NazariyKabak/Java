package OOP.Task7;

public abstract class Aninal {
    String name;

    public Aninal(String name) {
        this.name = name;
    }

    public abstract void makeNoise();
    public abstract void eat(String...food);
    public abstract String getDescription();



}
