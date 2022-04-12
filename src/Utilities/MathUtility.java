package Utilities;

public class MathUtility {
    public static void main(String[] args) {

        System.out.println(isEven(19));
        System.out.println(max(45,36));
    }
    public static int sumOfTwoNumbers(int num1,int num2){
        return num1+num2;
    }
    public static double sumOfTwoNumbers(double num1,double num2){
        return num1+num2;
    }

    public static int subtract(int num1,int num2){
        return num1-num2;
    }
    public static double subtract(double num1,double num2){
        return num1-num2;
    }

    public static int multiplicationOfTwoNumbers(int num1,int num2){
        return num1*num2;
    }
   
    public static double multiplicationOfTwoNumbers(double num1,double num2){
        return num1*num2;
    }
    public static double divisionOfTwoNumbers(double num1,double num2){
        return num1/num2;
    }
    public static boolean isEven(int num){
        return (num%2==0)? true: false;
    }
    public static boolean isOdd(int num){
        return (num%2!=0)? true: false;
    }
    public static int max(int num1, int num2){
        return (num1>num2)?num1:num2;
    }
    public static double max(double num1, double num2){
        return (num1>num2)?num1:num2;
    }
    public static int min(int num1, int num2){
        return (num1<num2)?num1:num2;
    }
    public static double min(double num1, double num2){
        return (num1<num2)?num1:num2;
    }
    public static int square(int num){
        return num*num;
    }
    public static double square(double num) {
        return num * num;
    }
    public static int cube(int num){
        return num * num * num;
    }
    public static double cube(double num) {
        return num * num * num;
    }

}
