package day08_IfStatement;

public class SchoolType {
    public static void main(String[] args) {
        /*
         Given a number(byte) grade level determine and print which
school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
Assume that the given number is 1 ~ 18
         */
        byte grade=7;
        String school;
        if (grade<=5&&grade>=1){
            school="Elementary school";
        }else if(grade<=8&&grade>=6){
            school="Middle school";
        }else if(grade<=12&&grade>=9){
            school="High school";
        }else if(grade<=16&&grade>=13){
            school="College";
        }else {
            school="Grad school";
        }
        System.out.println("The student is at "+school);


    }
}
