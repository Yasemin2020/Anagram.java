package DAY19_LoopPractices;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scan=new Scanner((System.in));
        while(true) {
            System.out.println("Enter the side of the square");
            double side = scan.nextDouble();
            if (side <= 0) {
                System.out.println("Invalid Entry for the side of the square");
                System.exit(0);
            }
            System.out.println("Area of square is= " + (side * side));
            System.out.println("Perimeter of square is= " + (4 * side));
            System.out.println("Would you like to calculate another Square?");
            String answer = scan.next();
            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry. Please enter yes/no");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break;
            }
        }
        /*
        Write a program that can calculate the area and perimeter of a
Square:
1. Ask the user "Enter the side of the
square:"
if user enters 0 or negative numbers,
terminate the program after displaying the error message "Invalid Entry
for the side of the square"
2. Display:
1. Area of square
2. Perimeter of square
3. Ask the user "Would you like to calculate
another Square?"
If "yes" --> repeat the
previous steps
If "No" --> Print "Thank you
for using Cydeo Square Calculator APP"
If user enters an invalid entry, ask
the user to re-enter until user provides a valid entry
         */


    }
}
