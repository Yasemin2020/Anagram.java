package day45_Interface.shape;

public class Triangle extends Shape{

   private double side, height;

    public Triangle(double side, double height) {
        super("Triangle");
        setSide(side);
        setHeight(height);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            throw new RuntimeException("Invalid side: "+side);
        }
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<=0){
            throw new RuntimeException("Invalid side: "+height);
        }
        this.height = height;
    }

    @Override
    public double area() {
        return side*height/2;
    }

    @Override
    public double perimeter() {
        return 3*side;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                super.toString()+
                ", side=" + side +
                ", height=" + height +
                '}';
    }

}
