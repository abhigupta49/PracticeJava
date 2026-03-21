package abstraction;

public class Circle extends Shape{
    static final double PI;
    private int radius;
    static {
        PI = 3.14;
    }
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}
