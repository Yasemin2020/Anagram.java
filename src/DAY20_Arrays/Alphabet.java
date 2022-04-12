package DAY20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] letters=new char[26];
        for (int i =0, j='Z'; i <letters.length && j>='A' ; i++, j--) {
            letters[i]=(char)j;
        }
        System.out.println(Arrays.toString(letters));
        System.out.println("-----------------------------------------------------");
        char[] letters2=new char[26];
        for(char i=0,j='Z'; i<letters2.length; i++,j--){//i: index numbers 0~last index
            letters2[i]=j;
        }

        System.out.println(Arrays.toString(letters2));
        System.out.println("-----------------------------------------------------");

        char[] letters3=new char[26];
        char ch='Z';
        for(int i=0; i<26; i++){
            letters3[i]=ch--;
        }
        System.out.println(Arrays.toString(letters3));

        System.out.println("-----------------------------------------------------");





    }
}
