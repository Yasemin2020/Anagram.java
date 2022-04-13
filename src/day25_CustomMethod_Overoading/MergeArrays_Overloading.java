package day25_CustomMethod_Overoading;

import java.util.Arrays;

public class MergeArrays_Overloading {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={4,6};
        System.out.println(Arrays.toString(mergeArrays(arr1,arr2)));
        /*
        Task1:
1. create a method that can merge two integer arrays.
2. create a method that can merge two double arrays.
3. create a method that can merge two char arrays.
4. create a method that can merge two String arrays.
         */
    }
    public static int[] mergeArrays(int[] arr1,int[] arr2){
        int[] arr=new int[arr1.length+arr2.length];
        for (int i = 0; i <arr1.length ; i++) {
            arr[i]=arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr[i+arr1.length]=arr2[i];
        }
        return arr;

    }
    public static double[] mergeArrays(double[] arr1,double[] arr2){
        double[] arr=new double[arr1.length+arr2.length];
        for (int i = 0; i <arr1.length ; i++) {
            arr[i]=arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr[i+arr1.length]=arr2[i];
        }
        return arr;

    }
    public static char[] mergeArrays(char[] arr1,char[] arr2){
        char[] arr=new char[arr1.length+arr2.length];
        for (int i = 0; i <arr1.length ; i++) {
            arr[i]=arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr[i+arr1.length]=arr2[i];
        }
        return arr;

    }
    public static String[] mergeArrays(String[] arr1,String[] arr2){
        String[] arr=new String[arr1.length+arr2.length];
        for (int i = 0; i <arr1.length ; i++) {
            arr[i]=arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr[i+arr1.length]=arr2[i];
        }
        return arr;

    }
}
