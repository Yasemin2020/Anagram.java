package DAY13_String;

import java.util.Scanner;

public class BeginEnd {
    /*
    write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=scan.next();
        scan.close();
        char firstCh=word.charAt(0);
        char lastCh=word.charAt(word.length()-1);
        if (firstCh==lastCh){
            System.out.println("equal");
        }else{
            System.out.println("different");
        }



    }
}
