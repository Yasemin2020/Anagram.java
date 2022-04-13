package day15_For_Loop;

import java.util.Scanner;

public class Warmup2 {
    public static void main(String[] args) {
        /*
         Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
         */
       String str=new Scanner(System.in).next();
       str.replace("x","a").replace("X","a");



    }
}
