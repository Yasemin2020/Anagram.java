package DAY24_CustomMethod_Return;

import java.util.Arrays;

public class MergeArraysMethod {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={4,5};
        System.out.println(Arrays.toString(mergeArrays(arr1,arr2)));
    }
    public static int[] mergeArrays(int[] arr1,int[] arr2){
        int[] arr=new int[arr1.length+arr2.length];
        for (int i = 0,j=0; i < arr1.length; i++,j++) {
            arr[j]=arr1[i];
        }
        for(int i=0,j=arr1.length;i<arr2.length;i++,j++){
            arr[j]=arr2[i];
        }
       return arr;
    }
}
