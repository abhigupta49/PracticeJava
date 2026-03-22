package polymorphism;

public class Cirlce extends Shape{
    private double radius;
    public Cirlce(double radius){
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Draw circle");

    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
