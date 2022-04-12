package Utilities;

import java.util.Arrays;

public class ArraysUtility {
   //prints each integer of an integer array in separate lines
    public static void printEach(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }
    //prints each double of a double array in separate lines
    public static void printEach(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }
    public static void printEach(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }
    public static void printEach(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }

    public static int[] addElement(int[] array, int element){
        int[] result=new int[array.length+1];
        int i=0;
        for(int each:array){
            result[i++]=each;

        }
        result[i]=element;
        return result;
    }
    public static double[] addElement(double[] array, double element){

        double[] result=new double[array.length+1];
        int i=0;
        for (double each : array) {
            result[i++]=each;
        }
        result[i]=element;// result[result.length-1] = element; // element need to be assigned to the last index
        return result;

    }
    public static char[] addElement(char[] array, char element){

        char[] result=new char[array.length+1];
        int i=0;
        for (char each : array) {
            result[i++]=each;
        }
        result[i]=element;// result[result.length-1] = element; // element need to be assigned to the last index
        return result;

    }
    public static String[] addElement(String[] array, String element){

        String[] result=new String[array.length+1];
        int i=0;
        for (String each : array) {
            result[i++]=each;
        }
        result[i]=element;// result[result.length-1] = element; // element need to be assigned to the last index
        return result;//Ctrl+R replace All

    }

    //returns the max number for integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }
    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //checks if the given integer is contained in the given array. Returns boolean .
   // contains (int[],int )
    public static boolean contains(int[] array,int element){
        boolean result=false;
        
        for (int each:array){
            if (each==element){
                result=true;
            }
        }
        return result;
        
    }
    public static boolean contains(double[] array,double element){
        boolean result=false;

        for (double each:array){
            if (each==element){
                result=true;
            }
        }
        return result;

    }
    public static boolean contains(char[] array,char element){
        boolean result=false;

        for (char each:array){
            if (each==element){
                result=true;
            }
        }
        return result;

    }
    public static boolean contains(String[] array,String element){
        boolean result=false;

        for (String each:array){
            if (each.equals(element)){
                result=true;
            }
        }
        return result;

    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element){
        int count=0;
        for (int each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }
    public static int frequencyOfElement(double[] array, double element){
        int count=0;
        for (double each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }
    public static int frequencyOfElement(char[] array, char element){
        int count=0;
        for (char each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }
    public static int frequencyOfElement(String[] array, String element){
        int count=0;
        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }
        return count;
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


    public static int[] removeElement(int[] array, int index){
        if(index<0||index> array.length-1){
            System.out.println("Invalid index: "+ index);
            System.exit(0);
        }

        int[] result=new int[array.length-1];
        int j=0;
        for (int i=0;i<array.length;i++) {
            if (i==index){// if the index of array is matching with the given index
                continue;// skip
            }

            result[j++]=array[i];

        }
        return result;
    }
    public static double[] removeElement(double[] array, int index){
        if(index<0||index> array.length-1){
            System.out.println("Invalid index: "+ index);
            System.exit(0);
        }

        double[] result=new double[array.length-1];
        int j=0;
        for (int i=0;i<array.length;i++) {
            if (i==index){// if the index of array is matching with the given index
                continue;// skip
            }

            result[j++]=array[i];

        }
        return result;
    }
    public static char[] removeElement(char[] array, int index){
        if(index<0||index> array.length-1){
            System.out.println("Invalid index: "+ index);
            System.exit(0);
        }

        char[] result=new char[array.length-1];
        int j=0;
        for (int i=0;i<array.length;i++) {
            if (i==index){// if the index of array is matching with the given index
                continue;// skip
            }

            result[j++]=array[i];

        }
        return result;
    }
    public static String[] removeElement(String[] array, int index){
        if(index<0||index> array.length-1){
            System.out.println("Invalid index: "+ index);
            System.exit(0);
        }

        String[] result=new String[array.length-1];
        int j=0;
        for (int i=0;i<array.length;i++) {
            if (i==index){// if the index of array is matching with the given index
                continue;// skip
            }

            result[j++]=array[i];

        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result={};
        for(int each:arr1){
            result=ArraysUtility.addElement(result, each);
        }
        for (int each : arr2) {
            result=ArraysUtility.addElement(result, each);
        }
        return result;
    }
    public static double[] merge(double[] arr1, double[] arr2){
        double[] result={};
        for(double each:arr1){
            result=ArraysUtility.addElement(result, each);
        }
        for (double each : arr2) {
            result=ArraysUtility.addElement(result, each);
        }
        return result;
    }
    public static char[] merge(char[] arr1, char[] arr2){
        char[] result={};
        for(char each:arr1){
            result=ArraysUtility.addElement(result, each);
        }
        for (char each : arr2) {
            result=ArraysUtility.addElement(result, each);
        }
        return result;
    }
    public static String[] merge(String[] arr1, String[] arr2){
        String[] result={};
        for(String each:arr1){
            result=ArraysUtility.addElement(result, each);
        }
        for (String each : arr2) {
            result=ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //reverse the given array, returns a new array
    public static int[] reverse(int[] array){
        int[] result=new int[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }
    public static double[] reverse(double[] array){
        double[] result=new double[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }
    public static char[] reverse(char[] array){
        char[] result=new char[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }
    public static String[] reverse(String[] array){
        String[] result=new String[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }

    //replace the elements of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement){
        if (index<0||index>=array.length){
            System.out.println("Invalid index: "+index);
            System.exit(0);
        }
        array [index]=newElement;
        return array;

    }
    public static double[] replace(double[] array, int index, double newElement){
        if (index<0||index>=array.length){
            System.out.println("Invalid index: "+index);
            System.exit(0);
        }
        array [index]=newElement;
        return array;

    }
    public static char[] replace(char[] array, int index, char newElement){
        if (index<0||index>=array.length){
            System.out.println("Invalid index: "+index);
            System.exit(0);
        }
        array [index]=newElement;
        return array;

    }
    public static String[] replace(String[] array, int index, String newElement){
        if (index<0||index>=array.length){
            System.out.println("Invalid index: "+index);
            System.exit(0);
        }
        array [index]=newElement;
        return array;

    }

    // replaces all the matching old values of the array with the new value
    public static int[] replaceALl(int[] array, int oldValue, int newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }
    public static double[] replaceALl(double[] array, double oldValue, double newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }
    public static char[] replaceALl(char[] array, char oldValue, char newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }
    public static String[] replaceALl(String[] array, String oldValue, String newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(oldValue)){
                array[i]=newValue;
            }
        }
        return array;
    }

    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){
        int[] result={};


        for (int each : array) {
            if(!(ArraysUtility.contains(result,each))){
                result=ArraysUtility.addElement(result,each);
            }

        }

        return result;
    }
    public static double[] removeDuplicates(double[] array){
        double[] result={};


        for (double each : array) {
            if(!(ArraysUtility.contains(result,each))){
                result=ArraysUtility.addElement(result,each);
            }

        }

        return result;
    }
    public static char[] removeDuplicates(char[] array){
        char[] result={};


        for (char each : array) {
            if(!(ArraysUtility.contains(result,each))){
                result=ArraysUtility.addElement(result,each);
            }

        }

        return result;
    }
    public static String[] removeDuplicates(String[] array){
        String[] result={};


        for (String each : array) {
            if(!(ArraysUtility.contains(result,each))){
                result=ArraysUtility.addElement(result,each);
            }

        }

        return result;
    }


        //inserts an element to the given index
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
    public static double[] insertToArray(double[] arr, int index, double element){
        double[] arr2=new double[arr.length+1];
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
    public static char[] insertToArray(char[] arr, int index, char element){
        char[] arr2=new char[arr.length+1];
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
    public static String[] insertToArray(String[] arr, int index, String element){
        String[] arr2=new String[arr.length+1];
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

    //exchanges the  elements of index i and j
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
