package day17_While_DoWhile;

import java.util.Scanner;

public class AdditionTillNegative {
    public static void main(String[] args) {
        /*
        Write a program that calculates the sum of numbers entered by the user until
         user enters a negative number.

            hint: you need an infinite loop

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter positive numbers");
        int n=scan.nextInt();
        int sum =0;
        while(n>=0){

            sum+=n;
            n= scan.nextInt();
        }
        System.out.println(sum);



    }
}
