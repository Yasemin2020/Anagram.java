package day15_For_Loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /*
        Write a program that can return the factorial number of any given
number
Ex:
input: 5
output: 120
( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
         */
        System.out.println("Enter a number:");
        int end=new Scanner(System.in).nextInt();
        int factorial=1;
        for (int i = 1; i <= end; ) {
            i++;
            factorial*=i;

        }
        System.out.println("factorial = " + factorial);


    }
}
