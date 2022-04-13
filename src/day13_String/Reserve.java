package day13_String;

import java.util.Scanner;

public class Reserve {
    public static void main(String[] args) {
        /*
        Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=scan.nextLine();

        int num=str.length();
        if(num==5){
            System.out.println(str);
        }else if (num>5){
            System.out.println("Too long!");
        }else{
            System.out.println("Too short!");
        }

    }
}
