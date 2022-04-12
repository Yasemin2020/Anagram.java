package DAY22_MultiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {
        String[] group1={"John","James","Joes"};
        String[] group2={"Ali","Ayse","Fatma"};
        String[] group3={"Elly","Kate","Mike"};

        String[][] groups=new String[3][];//index:0,1,2
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

        //System.out.println(Arrays.toString(groups));//toString is for one dimensional Arrays
        System.out.println(Arrays.deepToString(groups));

        System.out.println("---------------------------------------------");
        /*
        {1,2,3}
        {4,5,6,7}
        {8,9,10,11,12}
         */
//index of elements     0 1 2   0 1 2 3   0 1  2  3  4
        int[][] arr2D={{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        //       index:   0         1          2

        //first braket for arrays' index; second for elements
        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(arr2D[2][3]);





    }
}
