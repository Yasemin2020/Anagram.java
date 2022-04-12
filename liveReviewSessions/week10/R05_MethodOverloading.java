package week10;

public class R05_MethodOverloading {
    public static void main(String[] args) {
        System.out.println( convertBritishToMetric(5,11));
        //Height 71 inches

        System.out.println(convertBritishToMetric(64));;

    }
    //Requirement : I will as parameter either inches or inches and feet together --->return value to cm
    public static double convertBritishToMetric(double feet, double inches) {
        //1 feet = 12 inches
        if (feet < 0 || inches < 0 || inches > 12) {
            System.err.println("Invalid feet orr inches");
            return -1;

        }

        return feet * 12 * 2.54 + inches * 2.54;

    }
    public static double convertBritishToMetric(double inches) {
        //1 feet = 12 inches


        return inches * 2.54;

    }


}
