package DAY21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] numbers={10,3,506,8,9};
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);//sorts the array in the ascending order
        System.out.println(Arrays.toString(numbers));
        System.out.println("-------------------------------------");

        int[] arr1={1,3,2};
        int[] arr2={1,2,3};
         boolean r1=Arrays.equals(arr1,arr2);

         Arrays.sort(arr1);
         Arrays.sort(arr2);
          boolean r2=Arrays.equals(arr1,arr2);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("----------------------------------------------");
        char[] ch1={'a','c','b'};
        char[] ch2={'b','a','c'};


        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram=Arrays.equals(ch1,ch2);
        System.out.println("anagram "+anagram);

    }

}
