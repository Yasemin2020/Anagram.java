package DAY12_Scanner;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName=scan.nextLine();

        System.out.println("Enter your building number: ");
        String building=scan.next();

        scan.nextLine();

        System.out.println("Enter your street name: ");
        String street=scan.nextLine();

        System.out.println("Enter your city name: ");
        String city= scan.nextLine();

        System.out.println("Enter your state name: ");
        String state= scan.next();

        System.out.println("Enter your zip code: ");
        String zipCode=scan.next();// enter enter: on the scanners memory. One empty nextLine would read that

        scan.nextLine();

        System.out.println("Enter your country name: ");
        String country= scan.nextLine();

        scan.close();

        System.out.println(fullName+"\n"+street+"\n"+city+", "+state+" "+zipCode+"\n"+country);

    }
}
