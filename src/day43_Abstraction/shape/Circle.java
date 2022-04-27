package day43_Abstraction.shape;

public class Circle extends Shape{
    private double radius;
    public final static double pi=3.14;

    public Circle(String name, double radius) {
        super(name);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }
}
