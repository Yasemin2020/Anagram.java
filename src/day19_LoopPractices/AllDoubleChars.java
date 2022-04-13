package day19_LoopPractices;

import java.util.Scanner;

public class AllDoubleChars {
    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        String str=new Scanner(System.in).nextLine();
        String word="";

        for (int i = 0; i < str.length(); i++) {
            int freq=0;
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(i)==str.charAt(j)){
                    freq++;

                    }
                }
            if(freq==2){
                if(!(word.contains(str.charAt(i)+"")))
                    word+=str.charAt(i);
            }


        }
        System.out.println("word = " + word);
        /*
        	3. Write a program that can display all the characters that appeared twice in the string.

         */
    }
}
