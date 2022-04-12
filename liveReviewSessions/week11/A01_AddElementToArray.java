package week11;

import java.util.Arrays;

public class A01_AddElementToArray {
    public static void main(String[] args) {

        String [] browserTypes = {"Chrome","Firefox","Safari"};
        String newBrowserOne = "Edge";
        String newBrowserTwo = "Opera";

        browserTypes = addElement(browserTypes,newBrowserOne);
        System.out.println(Arrays.toString(browserTypes));
        // browserTypes : is reference to our Array Object, and can be reassigned
        browserTypes = addElement(browserTypes,newBrowserTwo);
        System.out.println(Arrays.toString(browserTypes));
    }

    public static String[] addElement (String[] arr,String element){
        String [] newArray = new String[arr.length+1];
        int i = 0;
        for( ; i< arr.length; i++){
            newArray[i]=arr[i];
        }
        newArray[i]=element;
        return newArray;
    }
}
