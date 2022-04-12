package DAY09_IfStatements;

public class NumberToWords {
    public static void main(String[] args) {
        /*Create a class called NumberToWord, and write a java program that can
                convert numbers between 0 ~ 9 to words
        Ex:
        number = 1;
        output:
        One*/
        int x=7;
        String number="";
        if (x==0)            number="Zero";
        else if (x==1)       number="One";
        else if (x==2)       number="Two";
        else if (x==3)       number="Three";
        else if (x==4)       number="Four";
        else if (x==5)       number="Five";
        else if (x==6)       number="Six";
        else if (x==7)       number="Seven";
        else if (x==8)       number="Eight";
        else if (x==9)       number="Nine";
        else                 number="invaalid number";
        System.out.println("number = " + number);


}}
