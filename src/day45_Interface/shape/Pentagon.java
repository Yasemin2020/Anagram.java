package day45_Interface.shape;

public class Pentagon extends Shape{

    private double side, height;

    public Pentagon(double side, double height) {
        super("Pentagon");
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
        return perimeter()*height/2;
    }

    @Override
    public double perimeter() {
        return side*5;
    }

    @Override
    public String toString() {
        return "Pentagon{" +
                super.toString()+
                ", side=" + side +
                ", height=" + height +
                '}';
    }
}
