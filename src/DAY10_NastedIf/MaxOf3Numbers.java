package DAY10_NastedIf;

import java.util.Scanner;

public class MaxOf3Numbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter three different numbers:");
        int num1=scan.nextInt();
        int num2= scan.nextInt();
        int num3= scan.nextInt();
        int maxNum;

        if (num1>num2&&num1>num3)
            maxNum=num1;
        else if(num2>num1&&num2>num3)
            maxNum=num2;
        else
            maxNum=num3;

        System.out.println(maxNum+" is the greatest number");


    }
}
