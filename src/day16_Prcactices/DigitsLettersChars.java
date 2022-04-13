package day16_Prcactices;

import java.util.Scanner;

public class DigitsLettersChars {
    public static void main(String[] args) {
        /*
        write a program that can retive the digits, letters and special
characters from a string
Ex:
input:
mn@#123Ab!
output:
letters: mnAb
digits: 123
special chars: @#!
         */
        String str=new Scanner(System.in).nextLine();
        int length=str.length();
        String letters="";
        String digits="";
        String specChars="";
        for (int i = 0; i <length ; i++) {
           char x= str.charAt(i);
            if(x>='a'&&x<='z'||x>='A'&&x<='Z') {
                letters += x;
            }else if(x>='0'&&x<='9'){
                digits+=x;
            }else{
                if(x!=' ')
                specChars+=x;
            }

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specChars = " + specChars);


    }
}
