package DAY27_WrapperClasses;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        arr=swapArrayElements(arr,2,4);
        System.out.println(Arrays.toString(arr));
        String[] str={"A","B","C","D"};
       str=ArraysUtility.swapArrayElements(str,0,2);
        System.out.println(Arrays.toString(str));

        /*
        Swap Task:
2.1 Create a method named swap that passes three parameters: integer
array, integer i, integer j. the method swaps the element at index i with
the element at index j, and returns the new array
Ex:
arr = {10, 20, 30, 40, 50};
swap(arr, 2, 4) ==>  {10, 20, 50, 40,
30}
2.2 Create the same function for double array, char array and string
array
         */

    }
    public static int[] swapArrayElements(int[] arr, int i, int j){
        int[] arr2=new int[arr.length];
        for (int k = 0; k < arr.length; k++) {
            if(k==i||k==j){
                arr2[j]=arr[i];
                arr2[i]=arr[j];
            }else{
                arr2[k]=arr[k];

            }
        }
        return arr2;
    }
    public static double[] swapArrayElements(double[] arr, int i, int j){
        double[] arr2=new double[arr.length];
        for (int k = 0; k < arr.length; k++) {
            if(k==i||k==j){
                arr2[j]=arr[i];
                arr2[i]=arr[j];
            }else{
                arr2[k]=arr[k];

            }
        }
        return arr2;
    }
    public static char[] swapArrayElements(char[] arr, int i, int j){
        char[] arr2=new char[arr.length];
        for (int k = 0; k < arr.length; k++) {
            if(k==i||k==j){
                arr2[j]=arr[i];
                arr2[i]=arr[j];
            }else{
                arr2[k]=arr[k];

            }
        }
        return arr2;
    }
    public static String[] swapArrayElements(String[] arr, int i, int j){
        String[] arr2=new String[arr.length];
        for (int k = 0; k < arr.length; k++) {
            if(k==i||k==j){
                arr2[j]=arr[i];
                arr2[i]=arr[j];
            }else{
                arr2[k]=arr[k];

            }
        }
        return arr2;
    }
}
