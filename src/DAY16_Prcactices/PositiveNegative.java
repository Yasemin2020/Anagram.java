package DAY16_Prcactices;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter number for 5 times, and print
how many positive and negative numbers user entered
Ex:
Inputs:
10
20
-1
0
3
Output:
3 positive and 1 negative
         */
        Scanner scan=new Scanner(System.in);
        int positives=0;
        int negatives=0;
        for (int i = 1; i <=5; i++) {
            System.out.println("Enter a number:");
            int number=scan.nextInt();
            if(number>0){
                positives++;
            } else if (number < 0) {
                negatives++;
            }


        }

        System.out.println("negatives = " + negatives);
        System.out.println("positives = " + positives);





    }
}
