package DAY19_LoopPractices;


import java.util.Scanner;

public class DuplicatedChar {

    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        String str=new Scanner(System.in).nextLine();
        int freq=0;
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            char c1=str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
               char c2=str.charAt(j);

                freq++;
               while(c1==c2){
                   freq++;
                   if (freq == 2) {
                       System.out.println("First duplicated char is \""+c1+"\" and index number is "+i);
                       System.exit(0);
                   }

               }


            }

        }

    }
}
/*
 Write a program that can return the first duplicated character from a string
	2. Write a program that can return the index number of the first duplicated character from a string

 */