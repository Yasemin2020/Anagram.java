package day27_WrapperClasses;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        /*
        Insert Task:
1.1 Create a method named insert that passes three
parameters: integer array, integer index, integer element. the method
inserts the given element to the given index of the array and returns the
new array
Ex:
arr = {10, 20, 30, 40, 50};
insert(arr, 2, 100) ==> {10,
20, 100, 30, 40, 50}
1.2 Create the same function for double array, char array
and string array
         */


        int[] numbers={10,20,30,40,50};
        numbers=insertToArray(numbers,2,100);

        System.out.println(Arrays.toString(numbers));

        String[] str={"A","B","C"};
        str=ArraysUtility.insertToArray(str,1,"5");
        System.out.println(Arrays.toString(str));


    }
    public static int[] insertToArray(int[] arr, int index, int element){
        int[] arr2=new int[arr.length+1];
        for (int i = 0; i < arr.length+1; i++) {
            if (i<index){
                arr2[i]=arr[i];
            }else if(i==index){
                arr2[i]=element;
            }else{
                arr2[i]=arr[i-1];
            }

        }
        return arr2;
    }
}
