package DAY25_CustomMethod_Overoading;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
        int[] intArray={5,6,0,-1,3,4};
        Arrays.sort(intArray);
        double[] doubleArray={10.5,.2,5.3,8.,8};
        Arrays.sort(doubleArray);
        char[] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
        Arrays.sort(charArray);
        System.out.println("---------------------------------");
        sumNumbers(10,20,30,40);
        sumNumbers(10.3,20.1);
        sumNumbers(2,3,2.3,4.1);
        System.out.println("------------------------");



        
        

    }
    public static int sumNumbers(int num1, int num2){
        return num1+num2;

    }
    public static double sumNumbers(double num1, double num2){
        return num1+num2;

    }
    public static double sumNumbers(double num1, double num2, double num3) {
        return num1 + num2 + num3;

    }
    public static int sumNumbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static int sumNumbers(int num1, int num2, int num3,int num4){
        return num1+num2+num3+num4;
    }
    public static double sumNumbers(double num1, double num2, double num3,double num4){
        return sumNumbers(num1,num2,num3)+num4;
    }



}
