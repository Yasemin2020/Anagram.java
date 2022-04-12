package DAY13_String;

import java.util.Scanner;

public class checkWords {
    public static void main(String[] args) {
        /*
         Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter three words");
        String word1=scan.next();
        String word2=scan.next();
        String word3=scan.next();
        int no1=word1.length();
        int no2=word2.length();
        int no3=word3.length();
        if (no1==no2&&no1==no3){
            System.out.println("All words are same length");
        }else if(no1!=no2&&no1!=no3&&no2!=no3){
            System.out.println("All different length");
        }else{
            System.out.println("Not Same nor Different lengths");
        }


    }
}
