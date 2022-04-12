package day08_IfStatement;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int number=305;
        boolean evenNumber=number%2==0;
        if (evenNumber){
            System.out.println(number+" is even number");
        }
        if (!evenNumber){
            System.out.println(number+" is odd number");
            System.out.println("---------------------------");

            int n=200;
            //positive
            if(n>0){
                System.out.println(n+" is positive");
            }
            //negative

            if(n<0){
                System.out.println(n+" is negative");
            }
            //zero
            if (n==0){
                System.out.println(n+" is zero");
            }




    }
}}
