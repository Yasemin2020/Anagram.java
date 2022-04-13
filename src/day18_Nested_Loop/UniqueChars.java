package day18_Nested_Loop;

import java.util.Scanner;

    public class UniqueChars {
        public static void main(String[] args) {

            String word="";
            System.out.println("Enter a string:");
            String str=new Scanner(System.in).nextLine();
            for (int i = 0; i < str.length() ; i++) {
                int freq=0;
                for (int j = 0; j < str.length() ; j++) {
                    if((str.charAt(i)==str.charAt(j))){
                        freq++;
                    }
                }
                if(freq==1){
                    word+=str.charAt(i);
                }
            }
            System.out.println(word);
        }
    }

