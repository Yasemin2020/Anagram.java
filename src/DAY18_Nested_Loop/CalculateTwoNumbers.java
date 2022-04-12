package DAY18_Nested_Loop;

import java.util.Scanner;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=scan.nextInt();

        System.out.println("Enter a math operator: ");
        char opr=scan.next().charAt(0);
        while(!(opr=='+'||opr=='-'||opr=='/'||opr=='*')){
            System.out.println("Invalid entry. Please enter a valid operator(+,-,/,*):");
            opr=scan.next().charAt(0);
        }
        System.out.println("Enter second number: ");
        int num2=scan.nextInt();
        double result=0;
        switch(opr){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '/':
                result=num1/num2;
                break;
            default:
                result=num1*num2;
        }
      /*  if(opr.equals("+")){
            result=num1+num2;
        }else if(opr.equals("-")){
            result=num1-num2;
        }else if(opr.equals("/")){
            result=num1/num2;
        }else{
            result=num1*num2;
        }*/
        System.out.println("result = " + result);

       /* Write a program that can calculate two numbers.
        1. Ask user to enter the first number
        2. Ask user to enter a math operator (+,-,/,*)
        (if user enters any invalid operator, repeat this step until user provides a valid operator)
        3. Ask user to enter the second number
        4. Display the result
        5. Ask user if they want to continue? (yes/no)
        if yes ==> repeat the entire steps
        if no ==> print "Thanks for using Cydeo calculator!"
        If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry*/





    }
}
