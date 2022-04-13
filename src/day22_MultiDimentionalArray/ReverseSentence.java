package day22_MultiDimentionalArray;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence="Today is a good day to learn Java";
        String[] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));
        String reversedSentence="";

        for (int i = 0; i <words.length ; i++) {
            reversedSentence+=words[words.length-1-i]+" ";
        }
        System.out.println(reversedSentence);

        /*
        1. Write a program that can reverse a sentence
Ex:
sentence = "Today is a good day to
learn Java";
output:
Java learn to day good a is Today
         */



    }
}
