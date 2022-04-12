package DAY20_Arrays;

import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
        int[] numbers= {10, 0, 5, 0, 1, 0};//{0,0,0,1,5,10}
        int[] decrease=new int[6];

Arrays.sort(numbers);

        for (int i = 5; i >=0 ; i--) {
            decrease[i]=numbers[5-i];

            }
        System.out.println(Arrays.toString(decrease));







                /*
                 write a program that can move all the zeros to the end of the array
        Ex:
            array =

            output:
                 {10, 5, 1, 0, 0, 0}

                 */
    }
}
