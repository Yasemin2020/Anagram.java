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

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000,300,1000,300,200,400,500,500,50,20,30,10,20,10,40,20,30,10));

        list=new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(list);

        list=new ArrayList<>(new TreeSet<>(list));
        System.out.println(list);

        System.out.println("-----------------------------------------");

        String[] array = {"A","A","B","C"};
        Set<String> s =new LinkedHashSet<>();
        s.addAll(Arrays.asList(array));
        s.addAll(Arrays.asList("E","F","G"));
        System.out.println("--------------------------------------------");
        /*
        Given:
        Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
        return the fifth element after removing the duplicates
        Do not change the order of the elements
         */

        Integer[] nums = {1,2,1,1,2,2,2,3,3,3,3,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
        nums=new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);

        System.out.println(nums);



        System.out.println("------------------------------------------");

        String str="eeeeeaaaabbbbccccdddeeeee";//e10a4b4c4d3
        String result="";

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            int count= Collections.frequency( Arrays.asList(str.split("")),each);
            result+=each+count;
        }
        System.out.println(result);

        System.out.println("--------------------------------------------------------");

        Set<String> names =new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet",null));

        System.out.println((names.toArray(new String[0])[2]));

        System.out.println(new ArrayList<>(names).get(4));

        for (String each : names) {
            System.out.println(each);
        }



    }
}
