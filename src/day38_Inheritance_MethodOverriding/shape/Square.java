package day38_Inheritance_MethodOverriding.shape;

public class Square extends Quadrilaterals{


    public Square(int side1) {
        super("Square", side1, side1);
    }

    @Override
    public double area() {
        return side1*side1;
    }

    @Override
    public double perimeter() {
        return 4*side1;
    }
}
