package week02;

public class ArithmaticOperators {
    public static void main(String[] args) {
        System.out.println("10/3="+(10/3));//which operations comes first in Java
        System.out.println("10/3.0="+10/3.0);//paranthesis comes first, division, multiplication is before concatination
        //IMPORTANT: JAVA runs from top to button, left to right
        System.out.println("10+3="+10+3);//10+3=103 string+integer
        int num1=10;
        double num2=3.0;
        int result= (int) (num1/num2);




    }

}
