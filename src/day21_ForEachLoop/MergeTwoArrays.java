package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        String[] group1={"Gunay", "Suat", "Havva", "Ali", "Mikael"};
        String[] group2={"Maria","Aygun","Duygu"};
        String[] students=new String[group1.length+group2.length];

        int i=0;

        for (String each : group1) {
            students[i++]=each;
        }

        for (String each : group2) {
            students[i++]=each;
        }
        System.out.println(Arrays.toString(students));

        System.out.println("----------------------------------------");
        char[] ch1={'A','B','C'};
        char[] ch2={'D','E','F','G','H'};

        char[] chars=new char[ch1.length+ch2.length];

        int j=0;
        for (char c : ch1) {
            chars[j]+=c;
            j++;
        }
        for (char c : ch2) {
            chars[j++]+=c;
        }

        System.out.println(Arrays.toString(chars));

        System.out.println("-------------------------------------------");

        int[] arr1={1,2,3,4};
        int[] arr2={5,6};

        int[] arr3=new int[arr1.length+arr2.length];
        int k=0;
        for (int each:arr1) {
          arr3[k++]+=each;

        }
        for(int each:arr2) {
            arr3[k++] += each;
        }
        System.out.println(Arrays.toString(arr3));



/*
write a program that can merge two arrays of integers
Ex:
arr1 = {1,2,3,4}
arr2 = {5,6}
output
arr3 = {1,2,3,4,5,6}
 */



    }
}
