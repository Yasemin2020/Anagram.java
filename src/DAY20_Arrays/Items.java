package DAY20_Arrays;

import java.util.Scanner;

public class Items {
    public static void main(String[] args) {

        String[] items=new String[5];
        Double[] prices=new Double[5];
        Scanner scan=new Scanner(System.in);
        double totalPrice=0;

        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter an item: ");
            items[i]=scan.nextLine();
            System.out.println("Enter its price: ");
            prices[i]= scan.nextDouble();
            scan.nextLine();
            totalPrice+=prices[i];


        }
        for (int i = 0; i <5 ; i++) {
            System.out.println(items[i]+"   -   "+prices[i]);
        }
        System.out.println("totalPrice = " + totalPrice);



        /*
        5. ItemsString[] items={"Apple", "Orange","Peach","Tomato","Grapes"};
        Double[] prices={5.5,   3.5,    12.0,   10.0,   15.0};
1. Create an array named items with the
length of 5
2. Create an array named prices with the
length of 5
3. Ask user to enter item name and price 5
times and store them into the items and prices arrays
4. calculate the total price of the arrays
5. display each item name and price in
separate lines
         */






    }
}
