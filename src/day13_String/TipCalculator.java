package day13_String;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        /*
        Create a class called TipCalculator, write a program for a tip
calculator.
There will be different service quality benchmarks that will determine the
tip given.
There will also the ability to calculate based on the number of people in
the party and if there is a split of the bill or not.
Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent
= 25%
The program should display the following information based on the
user input:
Split or No split (Yes or No),  Number of people entered: (number)
(each person = & in output) Check amount: (number) Service Quality:
(String) Total to pay: Total tip: Total per person: Tip per person:
Ex:
Split or No split (Yes or No)?
Yes
Enter the number of people
4
Enter the check amount:
476
How was the srvice quality?
(Excellent/Great/Good/Fair/Poor)
Excellent
output:
Number of people entered: 4
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
HINT: you will need to use .equals() method
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)");
        String split=scan.next().toLowerCase();

        System.out.println("Enter the number of people");
        int number=scan.nextInt();

        System.out.println("Enter the check amount:");
        double amount=scan.nextDouble();

        System.out.println("How was the service quality?\n(Excellent/Great/Good/Fair/Poor)");
        String quality= scan.next().toLowerCase();

        scan.close();

        double tip=0;


        if (split.equals("Yes")||split.equals("yes")){

            switch(quality){
                case "Excellent":
                case "excellent":
                tip=amount*25/100;
                break;
                case "Great":
                case "great":
                    tip=amount*20/100;
                break;
                case "Good":
                case "good":
                    tip=amount*15/100;
                    break;
                case "Fair":
                case "fair":
                    tip=amount*10/100;
                    break;
                case "Poor":
                case "poor":
                    tip=amount*5/100;
                    break;
            }
            System.out.println("Number of people entered: "+number);
            System.out.println("Total to pay: "+(amount+tip));
            System.out.println("Total Tip: "+tip);
            System.out.println("Total per person: "+(amount+tip)/number);
            System.out.println("Tip per person: "+tip/number);

        }else{
            System.out.println("Number of people entered: "+number);
            System.out.println("Total to pay: "+(amount+tip));
            System.out.println("Total Tip: "+tip);





        }


    }
}
