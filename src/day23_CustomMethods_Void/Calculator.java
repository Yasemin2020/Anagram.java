package day23_CustomMethods_Void;

public class Calculator {
    public static void main(String[] args) {
        calculator(12,3,'+');
        calculator(12,3,'-');
        calculator(12,3,'*');
        calculator(12,3,'/');
    }
    public static void calculator(int num1, int num2, char opr){
        double result=0;
        if(opr=='+'){
            result=num1+num2;
        }else if(opr=='-'){
            result=num1-num2;
        }else if(opr=='*'){
            result=num1*num2;
        }else{
            result=num1/num2;
        }
        System.out.println("result = " + result);
    }
/*
15. create a method named calculator that passes three arguments
(num1, num2, mathOperator), prints the calculation result
 */


}
