package DAY25_CustomMethod_Overoading;

import Utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        ArraysUtility.printEach(arr1);

        double[] arr2={1.1,2.2,3.3};
        ArraysUtility.printEach(arr2);

        char[] arr3={'A','B','C','D'};
        ArraysUtility.printEach(arr3);

        String[] names={"David","Hasan","Ali","Ayse"};
        ArraysUtility.printEach(names);

        System.out.println("------------------------------------");
        int[] n1={1,2,3,4,5,6};
        System.out.println(ArraysUtility.max(n1)) ;

        int[] a1={1,2,3,4,5,6,7};
        boolean b1=ArraysUtility.contains(a1,5);
        System.out.println("b1 = " + b1);

    }
}
