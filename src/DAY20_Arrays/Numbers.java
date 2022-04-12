package DAY20_Arrays;

import java.util.Arrays;

public class Numbers {
    public static void main(String[] args) {
       //create an array that has the numbers 1 to 100
      int[] numbers=new int[100];
        for (int i = 0; i <100 ; i++) {
            numbers[i]=i+1;
        }
        System.out.println(Arrays.toString(numbers));

    }
}
