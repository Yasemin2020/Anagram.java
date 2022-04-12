package day10_NastedIf;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        byte grade= input.nextByte();
        String level="";
        if(grade>=1&&grade<=18) {
            if (grade >= 1 && grade <= 5)
                level = "Elementary school";
            else if ((grade >= 6 && grade <= 8))
                level = "Middle School";
            else if ((grade >= 9 && grade <= 12))
                level = "High School";
            else if ((grade >= 13 && grade <= 16))
                level = "College";
            else
                level = "Grad School";

        }else{
            level="Invalid";}
        System.out.println("level = " + level);

        /*else if((grade>=6&&grade<=8))
            level="Middle School";
        create a class called GradeLevel, Given a number(byte) grade level
determine and print which school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
For Any Other grade: Invalid grade level given
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
         */

    }
}
