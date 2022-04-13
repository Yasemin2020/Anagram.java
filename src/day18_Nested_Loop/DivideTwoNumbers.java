package day18_Nested_Loop;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers");

        int a=scan.nextInt();
        int b=scan.nextInt();
        int count=0;
        while(a>=b){
            a-=b;
            count++;
        }

        System.out.println("a/b= "+count);
        System.out.println("with a remainder "+a);
    }
}
