package week11;

import java.util.ArrayList;
import java.util.Arrays;

public class SomeUsefulMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(Integer.valueOf(1));
        System.out.println(list);
        //array to arrayList

        String[] array= {"red", "green", "blue"};
        ArrayList<String> listTwo=new ArrayList<>(Arrays.asList(array));
        System.out.println(listTwo);

        //array list into an array

        String[] arrayTwo=new String[listTwo.size()];
        listTwo.toArray(arrayTwo);
        System.out.println(Arrays.toString(arrayTwo));

        //how to make an int array to an Integer ArrayList
        int[] array3= {1,2,3,4};
        ArrayList<Integer> list3=new ArrayList<>();
        //  listThree.addAll(Arrays.asList(arrayThree));
        /*
        java: incompatible types: cannot infer type arguments for java.util.ArrayList<>
    reason: inference variable E has incompatible bounds
      equality constraints: java.lang.Integer
      lower bounds: T,int[]
         */

        for(Integer each : array3){ // autoboxing
            list3.add(each);
        }
        System.out.println(list3);



    }
}
