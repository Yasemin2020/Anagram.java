package day43_Abstraction.shape;

public class Rectangle extends Shape {
    private double weight, length;

    public Rectangle(String name, double weight, double length) {
        super(name);
        this.weight = weight;
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return weight*length;
    }

    @Override
    public double perimeter() {
        return 2*(weight+length);
    }
}
/*
Rectangle:
					area(): w * l
					perimeter(): 2 * (w+l)

 */