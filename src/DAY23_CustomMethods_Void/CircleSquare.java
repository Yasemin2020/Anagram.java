package DAY23_CustomMethods_Void;

public class CircleSquare {
    public static void main(String[] args) {
        circle(2.3);
        square(4);
    }

    public static void circle(double r){
        double areaOfCircle =2*3.14*r;
        System.out.println("areaOfCircle = " + areaOfCircle);
    }
    public static void square(double a){
        double areaOfSquare=a*a;
        System.out.println("areaOfSquare = " + areaOfSquare);
    }


    /*
    6. create a method that can calculate the area of a circle
    7. create a method that can calculate the area of a square
     */

}
