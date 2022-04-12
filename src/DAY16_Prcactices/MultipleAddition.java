package DAY16_Prcactices;

import java.util.Scanner;

public class MultipleAddition {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two positive numbers to multiply:");
        int n1= scan.nextInt(), n2=scan.nextInt();
        int sum=0;
        if (n1>0&&n2>0){
            for (int i = 1; i <=n2; i++) {
             sum+=n1;
            }
            System.out.println(sum);
        }else{
            System.out.println("Invalid");
        }

        /*
3. Write a program that asks user to enter two positive numbers,
then multiply those two numbers without using multiplication (*)
operator.
if user enters any negative numbers, print Invalid
Ex:
inputs:
10
20
output:
200         */
    }

}
