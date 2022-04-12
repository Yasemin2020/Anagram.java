package DAY22_MultiDimentionalArray;

import java.util.Arrays;

public class ReverseArr2D {
    public static void main(String[] args) {
        /*
        Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};

		output:
			reverse = { {4,5,6},{1,2,3}};
         */
        int[][] array={ {1,2,3}, {4,5,6}};
        int[][] reverse=new int[array.length][];

        for (int i = array.length-1; i >=0 ; i--) {


            reverse[array.length-1-i]=array[i];




        }
        System.out.println(Arrays.deepToString(reverse));

    }
}
