package OOP.Task9;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    public void run() {
        Shape [] shapes = {new Circle("Green",1,4,33),
        new Rectangle("Red", 2,3,2,3)};
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
