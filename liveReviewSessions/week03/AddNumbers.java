package week03;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        //WRITE YOUR CODE HERE:
        int $number=0;

        if (a>b){

            $number=a;
        } else if (b>a){
            $number=b;
        }
        System.out.println($number+" is greater");
    }
}
