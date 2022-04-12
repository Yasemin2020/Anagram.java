package DAY19_LoopPractices;

import java.util.Scanner;

public class FirstUniqueChar {
    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        String str=new Scanner(System.in).nextLine();

        String result="";
        for (int i = 0; i < str.length(); i++) {
            int freq=0;
            for (int j = 0; j <str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                  freq++;
                }
            }
            if(freq==1) {
                System.out.println("First unique characters index number is " + i+ " and it is "+ str.charAt(i));
                System.exit(0);
            }

        }


        /*
        4. Write a program that can return the index number of the first unique character.
         */
    }
}
