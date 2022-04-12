package DAY16_Prcactices;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {//i=0 i<10; n=1 n<10
        //
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string:");//"aaabbbbbcc";
        String str=scan.nextLine();
        System.out.println("Enter a char:");
        char ch=scan.next().charAt(0);

        int frequency=0;

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==ch)
            frequency++;

        }
        System.out.println(frequency);
        /*
        Write a program that asks user to enter a string and a char, the
returns the frequency of the char from the given string
Ex:
inputs:
str = "aabcccd";
char = 'c';
output: 3
inputs:
"Java programming language"
'g'
output: 4
         */



    }

}
