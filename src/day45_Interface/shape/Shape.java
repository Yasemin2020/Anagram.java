package day45_Interface.shape;

public abstract class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }
   /* public Shape(String name) {
        this.name = getClass().getSimpleName();//contructor böyle de yazılabilir.
    }*/
    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
