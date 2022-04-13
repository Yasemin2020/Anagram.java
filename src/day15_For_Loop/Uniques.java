package day15_For_Loop;

import java.util.Scanner;

public class Uniques {
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        String word=new Scanner(System.in).nextLine();//"AARBBBCCCCBACDFV";

        String result="";
        for (int i = 0; i < word.length(); i++) {
            String ch=""+word.charAt(i);
            if (word.indexOf(ch)==word.lastIndexOf(ch)){
                result+=word.charAt(i);
            }

        }
        System.out.println(result);



        /*
        3. Write a program that can return the unique characters from a
String
Ex:
input:
AABCCD
output:
BD
Hint: You will need indexOf() and
lastIndexOf()
  if the first and last index
numbers of the character are same, then it's unique
  indexOf('A') ==> 0
  lastIndexOf('A') ==> 1
  indexOf('B') ==>2
  lastIndexOf('B') ==> 2
         */

    }
}
