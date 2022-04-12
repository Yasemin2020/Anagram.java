package DAY13_String;

import java.util.Scanner;

public class FirstLastCh {
    public static void main(String[] args) {
        /*
        write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
                         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence=scan.nextLine();
        scan.close();
        char first=sentence.charAt(0);
        char last=sentence.charAt(sentence.length()-1);
        System.out.println("first = " + first);
        System.out.println("last = " + last);



    }}
