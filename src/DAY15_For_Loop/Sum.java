package DAY15_For_Loop;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        /*
        write a program that can calculate the sum of all numbers between
1 to any given number
ex:
input: 100
output: 5050
input: 50
output: 1275
         */
        int sum=0;
        System.out.println("Enter the last number to be added:");
        int end=new Scanner(System.in).nextInt();

        for (int i = 0; i <=end ; i++) {
            sum+=i;

        }

        System.out.println("sum = " + sum);

    }
}
