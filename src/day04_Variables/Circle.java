package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        double pi=3.14;
        double radius= 5;
        double diameter=radius*2;
        double area= pi*radius*radius;
        double perimeter=2*pi*radius;
        System.out.println("diameter = " + diameter);
        System.out.println("radius = " + radius);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        /*Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle

        		PI, radius, diameter, area, perimeter
                        Hints: 	PI = 3.14
        						area = radius * radius * PI
        							Perimeter = 2 * radius * PI
        							*/
    }
}
