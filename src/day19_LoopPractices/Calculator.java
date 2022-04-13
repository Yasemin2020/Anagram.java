package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int num1 = scan.nextInt();

            System.out.println("Enter a math operator: ");
            char opr = scan.next().charAt(0);
            if (!(opr == '+' || opr == '-' || opr == '/' || opr == '*')) {
                System.err.println("Invalid entry. ");
                System.exit(0);//if the opr not valid terminates the whole program
            }
            System.out.println("Enter second number: ");
            int num2 = scan.nextInt();
            double result = 0;
            switch (opr) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    result = num1 * num2;
            }

            System.out.println("result = " + result);
        }
    }

