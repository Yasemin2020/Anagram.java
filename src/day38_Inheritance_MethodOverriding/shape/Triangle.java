package day38_Inheritance_MethodOverriding.shape;

public class Triangle extends Shape {
    public double side1, h;


    public Triangle( double side1, double h) {
        super("Triangle");
        this.side1 = side1;
        this.h = h;
    }

    @Override
    public double area() {
        return side1*h/2;
    }

    @Override
    public double perimeter() {
        return 3*side1;
    }
}
