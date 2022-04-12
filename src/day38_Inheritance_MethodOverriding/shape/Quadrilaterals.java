package day38_Inheritance_MethodOverriding.shape;

public class Quadrilaterals extends Shape {

    public int side1, side2;

    public Quadrilaterals(String name, int side1, int side2) {
        super(name);
        this.side1=side1;
        this.side2=side2;
    }

    @Override
    public double area(){
       return side1*side2;
    }

    @Override
    public double perimeter() {
        return 2*(side1+side2);
    }
}
