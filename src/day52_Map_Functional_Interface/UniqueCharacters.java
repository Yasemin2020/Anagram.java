package day52_Map_Functional_Interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabcccdeeef";
        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();
        for (String each : arr) {
            int frequency= Collections.frequency(Arrays.asList(arr), each);
            if(frequency==1)     {
                result.put(each,1);
            }

        }
        System.out.println(result);

    }
}
