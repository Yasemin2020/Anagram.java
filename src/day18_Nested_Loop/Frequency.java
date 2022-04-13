package day18_Nested_Loop;

public class Frequency {
    public static void main(String[] args) {


    /*
    Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters


     */
    String str="aaabbbbbbbccccdd";
    String result="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int count=0;

            for (int j = 0; j <str.length() ; j++) {
             if(ch==str.charAt(j)){
                 count++;
             }
              }
            if(!(result.contains(""+ch))){

                result+=ch;
                result+=count;
            }


        }

        System.out.println("result = " + result);

}}
