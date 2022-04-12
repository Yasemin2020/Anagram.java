package DAY12_Scanner;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
       /* Write a program that can convert cents to dollars, if there is any
        remainder include them in the result as cents
        Ex:
        Enter cents
        225
        output:
        225 cents equal to: 2 dollars and 25 cents*/
        Scanner scan=new Scanner(System.in);
        int cents=scan.nextInt();
        int dollars=cents/100;
        int cent=cents%100;
        System.out.println(cents+" equaal to: "+dollars+" dollars and "+cent+" cents" );



    }
}
