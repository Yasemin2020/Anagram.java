package DAY13_String;

import java.util.Scanner;

public class TreeLetterss {
    public static void main(String[] args) {
        /*
         Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=input.nextLine();
        int number=str.length();
        if(number>3){
            System.out.println(str.substring(number-3));
        }else if(number>0&&number<=3){
            System.out.println(str);
        }else{
            System.out.println("String is empty");

        }


        }
}
