package day45_Interface.shape;

public class Cylinder extends Shape implements Volume{

    private double radius, height;
    public final static double pi=3.14;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        setRadius(radius);
        setHeight(height);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<0){
            throw new RuntimeException("Invalid radius: "+radius);
        }
        this.radius = radius;
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
        return 2*pi*radius*radius+2*pi*radius*height;
    }

    @Override
    public double perimeter() {
        return 2*height+4*radius;
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString()+
                ", radius=" + radius +
                ", height=" + height +
                '}';
    }
}
