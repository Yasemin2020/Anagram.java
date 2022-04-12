package week06;

import java.util.Scanner;

public class UpperBound_Bak {
    public static void main(String[] args) {
        /**
         *
         * Question-8:

         Write a program to calculate the sum of the numbers from 1 till upper bound.
         If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
         If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
         If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.

         */


        System.out.println("Enter bound number:");
        int bound=new Scanner(System.in).nextInt();
        int sum=0;
        boolean check=true;
        for(;check;){
        if (bound>0){
        for (int i = 0; i <=bound ; i++) {
            sum+=i;
        }
        check=false;
        }else{
            System.out.println("Enter a valid upper bound: ");
            bound=new Scanner(System.in).nextInt();
        }
        System.out.println(sum);
    }
}}
