package DAY22_MultiDimentionalArray;

import java.util.Arrays;

public class ReverseAll {
    public static void main(String[] args) {
           /*
        Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};

		output:
			reverse = { {6,5,4}, {3,2,1},};
         */

        int[][] array={ {1,2,3}, {4,5,6}};
        int[][] reverse=new int[array.length][];


        for (int i = array.length - 1; i >= 0; i--) {
            int rev[]=new int[array[i].length];
            for (int j = 0; j <= array[i].length - 1; j++) {
                rev[j]=array[i][array[i].length - 1-j];

                reverse[array[i].length - 1-i][j]=rev[j];

            }

        }
        System.out.println(Arrays.deepToString(reverse));



    }
}
