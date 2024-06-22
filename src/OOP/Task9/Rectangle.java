package OOP.Task9;

public class Rectangle extends Shape{
    double x,y,w,h;

    public Rectangle(String color, double x, double y, double w, double h) {
        super(color);
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public void draw() {
        System.out.println("Paint "+ x + ", " + y + ", " + w + ", " + h);
    }
}
