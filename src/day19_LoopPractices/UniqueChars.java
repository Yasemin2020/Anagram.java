package day19_LoopPractices;

public class UniqueChars {
    public static void main(String[] args) {
        String str="aabccdeef";
        String result="";

        for (int j = 0; j <str.length() ; j++) {


            char ch = str.charAt(j);
            int freq = 0;
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    freq++;
                }
            }
            if(freq==1){
                result+=ch;
            }

        }

        System.out.println("result = " + result);

        /*

 Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

         */
    }

}
