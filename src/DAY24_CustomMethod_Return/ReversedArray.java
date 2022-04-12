package DAY24_CustomMethod_Return;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(reversedArray(arr)));

    }
    public static int[] reversedArray(int[] arr){
       int[]reversedArray =new int[arr.length];
        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {

            reversedArray[j]=arr[i];

        }
        return reversedArray;

    }

}
