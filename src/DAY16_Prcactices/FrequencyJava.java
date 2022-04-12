package DAY16_Prcactices;

import java.util.Scanner;

public class FrequencyJava {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);//I love Java. Java is Java not so tough
        System.out.println("Enter a sentece:");
        String sentence= scan.nextLine();
        int count=0;
        for (int i = 0; i <sentence.length()-4 ; i++) {
           if (sentence.substring(i,i+4).equals("Java"))
            count++;
        }
        System.out.println(count);

        /*
      4. write a program that can return the frequency of the a word Java from
the sentence
Ex:
sentence = "Java Java";
output:
2
         */
    }
}
