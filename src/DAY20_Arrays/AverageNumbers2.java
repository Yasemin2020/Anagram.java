package DAY20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbers2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int num=scan.nextInt();
        double total=0;

        int[] numbers=new int[num];
        for (int i = 0; i <num ; i++) {
            System.out.println("Enter a number");
            numbers[i]=scan.nextInt();
            total+=numbers[i];

        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Average= "+(total/num));



        /*
        AverageNumber:
1. Ask the user how many numbers they want to
enter
2. get all the inputs from the user and store
them into an array
3. Iterate the array & return the average
number
         */
    }
}
