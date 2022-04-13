package day19_LoopPractices;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true) {
            System.out.println("How much do you make an hour?");
            double hourlyRate = scan.nextDouble();
            if (hourlyRate <= 0) {
                System.out.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }
            System.out.println("How many hours do you work per week?");
            int hour = scan.nextInt();
            if (hour < 1 || hour > 144) {
                System.out.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate");
            double stateRate = scan.nextDouble();
            if (stateRate < 0 || stateRate > 10) {
                System.out.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }
            double grossSalary = hour * hourlyRate * 4;
            double fedarelTax = grossSalary * 26 / 100;
            double stateTax = grossSalary * stateRate / 100;

            System.out.println("grossSalary = " + grossSalary);
            System.out.println("fedarelTax = " + fedarelTax);
            System.out.println("stateTax = " + stateTax);
            System.out.println("Total Tax= " + fedarelTax + stateTax);
            System.out.println("Net Income= " + (grossSalary - fedarelTax - stateTax));
            System.out.println("Would you like to continue?");
            String answer = scan.next();

            if (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid Entry");
                System.exit(0);
            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }

        }
        /*
        Write a program for the salary calculator
1. Ask the user "How much you make an hour?"
If user entered hourlyRate
is 0 or negative, terminate the program after displaying the error message
"Invalid Entry for Hourly Rate"
2. Ask the user  "How many hours do you work
per week?"
if user entered weeklyHour
is less than 1 or greater than 144, terminate the program after displaying
the error message "Invalid Entry for Weekly Hours"
3. Ask the user  "Enter your state tax rate"
if the state tax rate is
less than 0% or greater than 10%, terminate the program after displaying
the error message "Invalid Entry for state tax Rate"
4. Display:
1. Gross Salary
2. Federal Tax (assume that
federal tax rate is 26%)
3. State Tax
4. Total Tax
5. Net Income
5. Ask the user "Would you like to continue?"
If "yes" --> repeat all the previous
steps
If "no" --> print "Thank you for using
Cydeo Salary Calculator APP"
If user enters an invalid entry,
terminate the program after displaying the error message "Invalid Entry"
         */
    }
}
