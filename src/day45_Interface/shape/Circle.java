package day45_Interface.shape;

public class Circle {
    private double radius;
    public final static double pi=3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<0){
            throw new RuntimeException("Invalid radius: "+radius);
        }
        this.radius = radius;
    }
}
