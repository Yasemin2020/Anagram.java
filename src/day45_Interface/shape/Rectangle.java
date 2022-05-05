package day45_Interface.shape;

public class Rectangle extends Shape {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        super("Rectangle");
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        if(side1<=0){
            throw new RuntimeException("Invalid side: "+side1);
        }
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        if(side2<=0){
            throw new RuntimeException("Invalid side: "+side2);
        }
        this.side2 = side2;
    }

    @Override
    public double area() {
        return side1*side2;
    }

    @Override
    public double perimeter() {
        return 2*(side1+side2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString()+
                ", side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }
}
