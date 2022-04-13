package day39_Recap.shappeTask;

public class ShapeObjects {
    public static void main(String[] args) {
        Square square=new Square(10);
        System.out.println(square);

        square.setSide(15);

        System.out.println(square);

        Rectangle rectangle=new Rectangle(5,6);
        System.out.println(rectangle);
        rectangle.setLength(10);

        System.out.println(rectangle.getLength());

        System.out.println(rectangle);

        System.out.println(rectangle.getName());

        Circle circle=new Circle(7.5);
        System.out.println(circle);

        circle.setRadius(10);
        System.out.println(circle.getRadius());

        System.out.println(circle);





    }
}
