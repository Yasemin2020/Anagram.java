package DAY18_Nested_Loop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int cost = 0;
while(true) {
    System.out.println("Which bedroom do you want to reserve?");
    String roomType = scan.nextLine().toLowerCase();

    System.out.println("How many nights will you stay?");
    int night = scan.nextInt();

    System.out.println("Would you like to reserve another room?");
    String answer = scan.next();
    scan.nextLine();

    while (!(answer.equals("yes") || answer.equals("no"))) {
        System.out.println("Invalid entry. Please enter yes/no: ");
        answer = scan.next().toLowerCase();
    }

    if (answer.equals("yes")) {

        if (roomType.equals("king bed")) {
            cost = 120 * night;
        } else if (roomType.equals("queen bed")) {
            cost = 100 * night;
        } else {
            cost = 80 * night;
        }
        cost+=cost;

    } else {
        break;
    }

}
        System.out.println("Your cost is "+cost);
scan.close();
/*
Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve,
             and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */


    }
}
