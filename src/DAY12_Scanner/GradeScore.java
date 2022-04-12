package DAY12_Scanner;

import java.util.Scanner;

public class GradeScore {
    public static void main(String[] args) {
/*
2. GradeReport:
2.1 Ask the user to enter the his/her score
2.2 Print the grade of the student (A, B, C, D, F)
2.3 If user enter invalid score (negative or more than 100)
print invalid score
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your score: " );
        int score=scan.nextInt();
        /*
         char grade;
        if(score>=0&&score<=100){
            grade= (score>=85)?'A':(score>=70)?'B':(score>=55)?'C':
                    (score>=45)?'D':'F';
            System.out.println("grade = " + grade);
        }else{
            System.out.println("Invalid score");
         */
        char grade;
        if(score>=0&&score<=100){
            grade= (score>=85)?'A':(score>=70)?'B':(score>=55)?'C':
                (score>=45)?'D':'F';
            System.out.println("grade = " + grade);
        }else{
            System.out.println("Invalid score");
        }

    }
}
