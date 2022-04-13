package day19_LoopPractices;

import java.util.Scanner;

public class GradeCalculater {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true) {
            System.out.println("Enter your score: ");
            int score = scan.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("Invalid Entry");
                System.exit(0);
            }
            char grade;

                grade= (score>=90)?'A':(score>=80)?'B':(score>=70)?'C':
                        (score>=60)?'D':'F';
                System.out.println("grade = " + grade);
            System.out.println("Would you like to continue? ");
            String answer = scan.next();
            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry. Please enter yes/no");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                break;
            }
        }
        /*
        Write a program for grade calculator:
1. Ask the user "Enter your score"
If user enters invalid score, terminate
the program after displaying the error message "Invalid Entry"
 2. Display the grade of the student.
 90 ~ 100 ==> A
 80 ~ 89 ==> B
 70 ~ 79 ==> C
 60 ~ 69 ==> D
 0 ~ 59 ==> F
2. Ask the user would you like to continue
If "yes" --> repeat the previous steps
If "no" --> print "Thank you for using
Cydeo Grade Calculator APP"
If user enters an invalid entry,
terminate the program after displaying the error message "Invalid Entry"
         */
    }
}
