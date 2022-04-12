package day10_NastedIf;

public class GradeReport {
    public static void main(String[] args)
    {
        int grade=100;
        String result="";

        if(grade>=0&&grade<=100){
        if (grade>=90){
            result="Exellant";
        } else if(grade<=89&&grade>=80){
            result="Great";
        } else if(grade<=79&&grade>=70){
            result="Good";
        } else if(grade<=69&&grade>=60){
            result="Passed";
        } else{
            result="Failed";
        }}
        else{
            result="invalid Score";}
            System.out.println("result = " + result);

    }
}
