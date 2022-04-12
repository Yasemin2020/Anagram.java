package DAY13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        /*
        write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
         */
        Scanner scan=new Scanner(System.in);
        String word1=scan.nextLine();
        String word2=scan.nextLine();
        char ch1= word1.toUpperCase().charAt(0);
        char ch2=word2.toUpperCase().charAt(0);
        System.out.println(ch1+"."+ch2);


    }
}
