
package day11_Switch_Scanner;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:
        String item1,item2,item3;
        double price1, price2, price3, totalPrice;

        System.out.println("Enter Item1 and its price:");
        Scanner scan=new Scanner(System.in);
        item1=scan.nextLine();
        price1=Double.parseDouble(scan.nextLine());
        /*
         Scanner scan=new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        String item1=scan.nextLine();
        double price1=scan.nextDouble();

         */

        System.out.println("Enter Item2 and its price:");
        item2=scan.nextLine();
        price2=Double.parseDouble(scan.nextLine());

        System.out.println("Enter Item3 and its price:");
        item3=scan.nextLine();
        price3=Double.parseDouble(scan.nextLine());

        totalPrice=price1+price2+price3;

        System.out.println("Item1: "+ item1 + " Price: " + price1 + ", Item2: " + item2 + " Price: "+ price2 + ", Item3: " + item3 + " Price: " + price3);
        System.out.println("Total price: " + totalPrice);
    }
}