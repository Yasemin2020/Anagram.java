package day20_Arrays;

import java.util.Arrays;

public class ReverseNumbers {
    public static void main(String[] args) {
        //create an array that has the numbers 100 to 1
        int[] revNum=new int[100];
        for (int i = 0; i <100 ; i++) {
            revNum[99-i]=i+1;
        }
        System.out.println(Arrays.toString(revNum));
    }
}
