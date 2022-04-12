package DAY26_CustomMethodsPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] arr = {1,1,1,11,1,2,3,3,3,4,4,1,1,1,1};
        int[] unique=uniqueElements(arr);
        System.out.println(Arrays.toString(unique));

        double[] array2 = {1.5, 2.5, 1.5, 3.5, 4.5, 4.5, 5.5, 5.5};

        double[] unique2 = uniqueElements(array2);

        System.out.println(Arrays.toString(unique2));


    }
    // returns the unique elements of the array as a new array
   


    public static int[] uniqueElements(int[] array){
        int[] result ={};
        for(int each:array){
            if (ArraysUtility.frequencyOfElement(array, each)==1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
        }
    public static double[] uniqueElements(double[] array){
        double[] result ={};
        for(double each:array){
            if (ArraysUtility.frequencyOfElement(array, each)==1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    public static char[] uniqueElements(char[] array){
        char[] result ={};
        for(char each:array){
            if (ArraysUtility.frequencyOfElement(array, each)==1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    public static String[] uniqueElements(String[] array){
        String[] result ={};
        for(String each:array){
            if (ArraysUtility.frequencyOfElement(array, each)==1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }





}
