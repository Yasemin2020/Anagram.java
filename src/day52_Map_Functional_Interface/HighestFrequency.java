package day52_Map_Functional_Interface;

import java.util.*;

public class HighestFrequency {
    public static void main(String[] args) {
        String str= "eeeeeaaabbbbccccdd";
        String[] arr= str.split("");

        Map<String,Integer> frequencies= new LinkedHashMap<>();

        for (String each : arr) {
            int freq= Collections.frequency(Arrays.asList(arr),each);
            frequencies.put(each,freq);
        }
        int maxFreq=0;
        String maxKey="";
        for (Map.Entry<String, Integer> entry : frequencies.entrySet()) {

           if (entry.getValue()>maxFreq){
               maxFreq=entry.getValue();
               maxKey=entry.getKey();
           }

        }
        System.out.println(maxKey+" = "+maxFreq);

        /*
        Write a program that can find the character that has the highest
frequency in a String
Note: Must use a map
Ex:
str = "eeeeeaaabbbbccccdd"
Output:
{e=5, a=3, b=4, c=4, d=2 }
character e has the highest frequency
         */

        ArrayList<String> arr2= new ArrayList<>();
        arr2.addAll(Arrays.asList("java", "java", "python", "c#"));

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : arr2) {
            int freq2= Collections.frequency(arr2,each);
            map.put(each,freq2);

        }
        //map.values().stream().sorted();
        for (Integer value : map.values()) {


        }

        System.out.println("map = " + map);


        /*
        Write a program that can find the element that has the highest
frequency in an arrayList
        Note: Must use a map
        Ex:
            list: [java, java, python, c#]
        output:
            [java=2, python=1, c#=1]
            element java has the highest frequency
         */
    }
}
