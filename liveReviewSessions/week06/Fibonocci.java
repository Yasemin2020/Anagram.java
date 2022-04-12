package week06;

public class Fibonocci {
    public static void main(String[] args) {
        /*
        noun: Fibonacci sequence
a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.
 Write a program to print
         Fibonacci series of n terms
         where n is declared by user :
         0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......

        This is a example of Fibonacci series of 6 terms

        term number        0    1    2    3    4    5    6
        Actual value    0,     1,     1,     2,     3,     5,     8

                           num1      num2       sum
        iteration 1         0     +    1    =    1
        iteration 2            1   +   1    =    2
        iteration 3            1   +   2    =    3
        iteration 4            2   +   3    =    5
        iteration 5            3    +    5    =    8
        .........
         */
        int number1=0, number2=1, sum=0;
        String series=number1+" "+number2+" ";
        int n=0;

        for (int i = 1; i <10 ; i++) {

                sum=number1+number2;
                number1=number2;
                number2=sum;
                series+=sum+" ";
                n=i+2;

        }
        System.out.println("series = " + series);
        System.out.println("Final number in sequence is: "+sum);
        System.out.println("Term number is: "+n);

    }
}
