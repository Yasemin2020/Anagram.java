package DAY08_IfStatement;

public class Sigarette {
    public static void main(String[] args) {
        /*
        Given a number (byte) age, write a program that can check if the
person is eligible to buy Cigarettes
         */
        byte age=15;
        String name="Hasan";
        if (age<18){
            System.out.println(name+" is not eligible to buy cigarette");
        }
        else {
            System.out.println(name+" is eligible to buy cigarette");
        }




    }
}
