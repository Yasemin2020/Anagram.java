package day25_CustomMethod_Overoading;

import Utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str= "Java Programming Language";
        StringUtility.printEachChar(str);
        System.out.println("------------------------------------");

        System.out.println( StringUtility.reverse(str));
        String s1="Wooden Spoon";
        String reverse=StringUtility.reverse(s1);
        System.out.println(reverse);
        System.out.println("-------------------------------");

        String word="Civic";
        boolean polindrome=StringUtility.isPalindrome(word);
        System.out.println(polindrome);
        System.out.println(StringUtility.isPalindrome("Java"));

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};
        int count=0;
        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }

        }
        System.out.println(count);
        
        boolean isAnagram=StringUtility.anagram("abc","cba");
        System.out.println("isAnagram = " + isAnagram);

        String str3="aaaaaaaaaaaabbbbbbbbbccccc";
        str3=StringUtility.removeDuplicates(str3);
        System.out.println(str3);

    }



}
