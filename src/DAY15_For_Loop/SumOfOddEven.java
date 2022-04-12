package DAY15_For_Loop;

public class SumOfOddEven {
    public static void main(String[] args) {
        /*
        Write a program that can return the sum of odd numbers between 1
to 100
         */
        int sum=0;
        for (int i = 1; i <=50 ; i++) {
            sum+=2*i-1;
        }

        System.out.println("sum = " + sum);
    }
}
