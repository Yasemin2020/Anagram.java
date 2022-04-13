package day17_While_DoWhile;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Do you want to reserve a room?");
        String answer=scan.next();
        while(!(answer.equals("yes")||answer.equals("no"))){
            System.out.println("Invalid entery. Please enter yes/no: ");
            answer=scan.next().toLowerCase();
        }
        if(answer.equals("yes")) {
            System.out.println("Which type of room do you want to reserve?");
            scan.nextLine();
            String roomType=scan.nextLine().toLowerCase();
            while(!(roomType.equals("king bed")||roomType.equals("queen bed")||roomType.equals("single bed")   )){
                System.out.println("Invalid room type. Please enter King Bed, Queen Bed or Single Bed ");
                roomType=scan.nextLine().toLowerCase();
            }
            if(roomType.equals("king bed")) {
                System.out.println("King bed is $120");
            }else if(roomType.equals("queen bed")){
                System.out.println("Queen bed is $100");
            }else{
                System.out.println("Single bed is $80");
            }

        }else{
            System.out.println("Have a nice day!");
        }

       }
}
