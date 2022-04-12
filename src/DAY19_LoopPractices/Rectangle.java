package DAY19_LoopPractices;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner((System.in));
        while(true) {
            System.out.println("Enter first side of the rectangle");
            double side1 = scan.nextDouble();
            System.out.println("Enter second side of the rectangle");
            double side2 = scan.nextDouble();
            if (side1 <= 0&&side2<=0) {
                System.out.println("Invalid Entry. Side cannot be negative or zero");
                System.exit(0);
            }
            System.out.println("Area of rectangle is= " + (side1 * side2));
            System.out.println("Perimeter of rectangle is= " + (2 * side1+2*side2));
            System.out.println("Would you like to calculate another rectangle?");
            String answer = scan.next();
            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry. Please enter yes/no");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
                break;
            }
        }
        /*
        Write a program that can calculate the area and perimeter of a
Rectangle:
1. Ask the user "Enter the length of the
Rectangle:"
if user enters 0 or negative numbers,
terminate the program after displaying the error message "Invalid Entry
for the length of the rectangle"
2. Ask the user "Enter the width of the
Rectangle:"
if user enters 0 or negative numbers,
terminate the program after displaying the error message "Invalid Entry
for the width of the rectangle"
3. Display:
1. Area of rectangle
2. Perimeter of rectangle
4. Ask the user "Would you like to calculate
another Rectangle?"
If "yes" --> repeat the
previous steps
If "No" --> Print "Thank you
for using Cydeo Rectangle Calculator APP"
If user enters an invalid entry, ask
the user to re-enter until user provides a valid entry
         */
    }
}
