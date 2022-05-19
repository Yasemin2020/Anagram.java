package day49_Collections;

import java.util.*;

public class SetPractice2 {

    public static void main(String[] args) {
        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        arr=new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);
      // arr=new HashSet<>(Arrays.asList(arr)).toArray(new String[0]);
       
        /*Set<String> set1 = new HashSet<>(Arrays.asList(arr));
        arr= set1.toArray(new String[0]);*/

        System.out.println(Arrays.toString(arr));







    }
}
