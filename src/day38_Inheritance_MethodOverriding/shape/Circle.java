package day38_Inheritance_MethodOverriding.shape;

public class Circle extends Shape{

    public double r, pi=3.14;

    public Circle(double r) {
        super("Circle");
        this.r = r;

    }

    @Override
    public double area() {
        return pi*r*r;
    }

    @Override
    public double perimeter() {
        return 2*pi*r;
    }
}
