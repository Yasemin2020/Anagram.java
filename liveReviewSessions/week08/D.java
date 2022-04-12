package week08;

import java.util.Arrays;

public class D {
    public static void main(String[] args) {
        String confirmation = "Id: 2239677\n" +
                "Amount: 790 USD\n"+
                "Card Number: 8548595959595\n"+
                "Name: oscar\n"+
                "Date: 11/10/2021";
        String[] arr1=confirmation.split("\n");

        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i <5 ; i++) {
            String[] arr2=arr1[i].split(":");
            System.out.println(Arrays.toString(arr2));
        }




        /*
        Break time task : capture the amount 790 with split method
        String confirmation = "Id: 2239677\n" +
                "Amount: 790 USD\n"+
                "Card Number: 8548595959595\n"+
                "Name: oscar\n"+
                "Date: 11/10/2021";

        System.out.println("confirmation = " + confirmation);
         */
    }
}
