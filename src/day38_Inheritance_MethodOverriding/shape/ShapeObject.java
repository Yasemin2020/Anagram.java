package day38_Inheritance_MethodOverriding.shape;

public class ShapeObject {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(5,2);
        Square square= new Square(6);
        Circle circle=new Circle(3);
        Rectangle rectangle=new Rectangle(15,20);

        System.out.println(rectangle);
        System.out.println(circle);
        System.out.println(square);
        System.out.println(triangle);


    }
}
