package day35_Encapsulation.encapsulation;

public class Circle {
    private int radius;
    public static double pi=3.14;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        if (radius<=0){
            System.out.println("Invalid data ");
            System.exit(0);
        }
        this.radius=radius;
    }

    public Circle(int radius) {
        setRadius(radius);
    }
    public double calcArea(){
        return pi*radius*radius;
    }
    public double calcPerimeter(){
        return 2*pi*radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", Area=" + calcArea() +
                ", Perimeter=" + calcPerimeter() +
                '}';
    }
}/*
 Create a class named Circle

			privtae variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the raidus of coircle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()


*/

