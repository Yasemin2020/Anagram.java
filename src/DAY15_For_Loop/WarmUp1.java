package DAY15_For_Loop;

import java.util.Scanner;

public class WarmUp1 {
    public static void main(String[] args) {
        /*
        1. Write a program that asks user to enter a word. If the word starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
         */

        System.out.println("Enter a word: ");
        String word=new Scanner(System.in).next();
        if (word.charAt(0)=='x'){
            word=word.replaceFirst("x","a");
         //System.out.println("a"+word.substring(1));

        }
        System.out.println(word);



    }
}
