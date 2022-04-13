package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char[] letters=new char[26];


      /*
        letters[0]='A';
        letters[1]='B';
        ...
         */

        for(char i='A',j=0; i<='Z'&& j<letters.length; i++,j++){
            letters[j]=i;

        }
        System.out.println(Arrays.toString(letters));
        //---------------------------------------------

        char[] letters2=new char[26];
        for(char i=0,j='A'; i<letters2.length; i++,j++){//i: index numbers 0~last index
            letters2[i]=(char)j;
        }

        System.out.println(Arrays.toString(letters2));
        //------------------------------------------------------
        char[] letters3=new char[26];
        char ch='A';
        /*for (int i = 0; i <letters3.length ; i++) {
            letters3[i]=ch++;

        }*/
        for (int i = 0; i <letters3.length ; i++,ch++) {
            letters3[i]=ch;

        }

        System.out.println(Arrays.toString(letters3));
        //-------------------------------------------------



















    }
}
