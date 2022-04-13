package day15_For_Loop;

import java.util.Scanner;

public class Polndrom {
    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        String str=new Scanner(System.in).nextLine();
        int length=str.length();
        str=str.toLowerCase();
        String rts="";
        for (int i = length-1; i >=0 ; i--) {
            rts+=str.charAt(i);

        }
        System.out.println("str = " + str);
        System.out.println("rts = " + rts);

        boolean polindrom=rts.equalsIgnoreCase(str);
        System.out.println(polindrom);
        }

        /*
        Write a program that can check if the given String is palindrome
Ex:
input:
Level
output:
true
input:
Anna
output:
true
         */





    }


