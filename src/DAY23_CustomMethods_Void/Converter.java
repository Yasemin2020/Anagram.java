package DAY23_CustomMethods_Void;

public class Converter {
    public static void main(String[] args) {
       dollarToEuro(56.62);
       dollarToLira(56.62);
       kgTolb(68);

    }
    public static void dollarToEuro(double dollar){
        double euro=dollar/1.08;
        System.out.println("$"+dollar+" = "+euro+" Euro");
    }
    public static void dollarToLira(double dollar){
        double tl=dollar*14.65;
        System.out.println("$"+dollar+" = "+tl+" TL");
    }
    public static void kgTolb(int kg){
        double lb=kg*2.204;
        System.out.println(kg+" kg ="+lb+" pounds");
    }

/*
      9. create a method that can convert dollar to euro
10. create a method that can can convert dollar to lira
11. create a method that can convert kg to lb
       */


}
