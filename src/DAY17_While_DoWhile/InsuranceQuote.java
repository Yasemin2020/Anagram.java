package DAY17_While_DoWhile;//task 6

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name= scan.nextLine();

        System.out.println("Enter your gender: ");
        String gender=scan.next().toLowerCase();
        while (!(gender.equals("female")||gender.equals("male"))){
            System.out.println("Invalid entry. Enter female/male");
            gender=scan.next().toLowerCase();
        }

        System.out.println("Are you married?");
        String married= scan.next().toLowerCase();
        while (!(married.equals("yes")||married.equals("no"))){
            System.out.println("Invalid entry. Enter yes/no");
            married= scan.next().toLowerCase();
        }

        System.out.println("Enter your age: ");
        int age=scan.nextInt();
        while(!(age>0&&age<120 )) {
            System.out.println("Invalid entry. Please re-enter your age: ");
            age = scan.nextInt();
        }

        System.out.println("How many miles do you drive in a day? ");
        int miles=scan.nextInt();
        while(miles<5) {
            System.out.println("Invalid entry. Please re-enter: ");
            miles = scan.nextInt();
        }
scan.nextLine();

        System.out.println("Do you want full coverage or liability insurance?");
        String insuranceType= scan.nextLine().toLowerCase();
        while (!(insuranceType.equals("full coverage")||insuranceType.equals("liability insurance"))){
            System.out.println("Invalid entry. Please re-enter: ");
            insuranceType= scan.nextLine().toLowerCase();
        }

        System.out.println("Did you have any accidents or claims in past 5 years?");
        String accident= scan.nextLine().toLowerCase();
        while (!(accident.equals("yes")||accident.equals("no"))){
            System.out.println("Invalid entry. Enter yes/no");
            accident= scan.nextLine().toLowerCase();
        }

        System.out.println("Does your car have an anti-theft device?");
        String antiTheft= scan.nextLine().toLowerCase();
        while (!(antiTheft.equals("yes")||antiTheft.equals("no"))){
            System.out.println("Invalid entry. Enter yes/no");
            antiTheft= scan.nextLine().toLowerCase();
        }

        int rate=100;//liability
        double a= (age<25)?90:50;
        a=(miles<=10)?a+10:(miles<=50)?a+30:a+50;


        double b= (age<25)?160:120;//fullCoverage
        b=(miles<=10)?b+20:(miles<=50)?b+40:b+70;

        if (antiTheft.equals("yes")) {
            rate -= 5;
        }
        if(accident.equals("yes")){
            rate+=15;
        }else{
            rate-=10;
        }
        if(married.equals("yes")){
            rate-=5;
       }
        System.out.println("rate = " + rate);
        if(insuranceType.equals("full coverage")) {
            System.out.println("liability insurance costs " + a * rate / 100);
        }else {
            System.out.println("full coverage costs " + b * rate / 100);
        }

    }
}
