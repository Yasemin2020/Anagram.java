package day13_String;

import java.util.Scanner;

public class LongestStr {
    public static void main(String[] args) {
        /*
        write a program that asks user to enter two strings, and print out the longest string
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two strings");
        String str1=scan.nextLine();
        String str2=scan.nextLine();
        scan.close();

        int l1=str1.length();
        int l2=str2.length();
        if (l1>l2){
            System.out.println("\""+str1+"\" is longest");
        }else if(l2>l1){
            System.out.println("\""+str2+" is longest");
        }else{
            System.out.println("they are equal");
        }




    }
}
