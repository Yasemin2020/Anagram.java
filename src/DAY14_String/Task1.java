package DAY14_String;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    /*
    Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two words: ");
        String word1=scan.next();
        String word2=scan.next();
        System.out.println(word1.substring(1)+word2.substring(1));




    }
}
