package day43_Abstraction.shape;

public class Square extends Shape {
    
    private double side;

    public Square(String name, double side) {
        super(name);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
       return side*side;
    }
    
    public double perimeter(){
        return 4*side;
    }
    
}
/*
Square:
					area(): s * s
					perimeter: 4 * s

 */