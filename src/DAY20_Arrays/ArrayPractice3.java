package DAY20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        System.out.println("How many numbers would you like to enter?");
        Scanner scan=new Scanner((System.in));
        int length=scan.nextInt();

        if (length<=0){
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        int[] numbers=new int[length];

        for (int i = 0; i <length ; i++) {
            System.out.println("Enter a number");
            numbers[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(numbers));
        scan.close();
        int total=0;

        for (int i = 0; i < length; i++) {
            total+=numbers[i];

        }
        System.out.println("Average is= "+(total/length));
















    }
}
