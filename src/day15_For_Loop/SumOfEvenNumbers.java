package day15_For_Loop;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        /*
        Write a program that can return the sum of even numbers between 1
to 100
         */
        int sum=0;
        for (int i = 0; i <51 ; i++) {
            sum+=2*i;
        }

        System.out.println("sum="+sum);
    }
}
