package day35_Encapsulation.encapsulation;

public class CircleObjects {
    public static void main(String[] args) {
        Circle circle1=new Circle(6);
        System.out.println("circle1 = " + circle1);
        circle1.setRadius(circle1.getRadius()+20);
        System.out.println(circle1);
    }


}
