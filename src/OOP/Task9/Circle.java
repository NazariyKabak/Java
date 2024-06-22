package OOP.Task9;

public class Circle extends Shape{
    int x,y;
    double radius;

    public Circle(String color, int x, int y, double radius) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Paint" + color + "  круг с центром в точке (" + x + ", " + y + ") и радиусом " + radius);
    }
}
