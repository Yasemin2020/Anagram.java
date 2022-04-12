package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {
        /*System.out.println(true==!false);//true
        System.out.println(!true != false);//false
        System.out.println(!false==true);//true

        System.out.println(!!false);//false
        System.out.println(!!!true);//false*/
       int score=85;//0-100
        boolean a=score>=90&&score<=100;
        boolean b= score>=80 && !a;//İf score is not a and greater than 80--- boolean a=score>=80&&score<=89;
        boolean c=!a && !b && score>=70;// boolean b=score>=70&&score<=79;
        boolean d=!a&&!b&&!c&& score>=60;// boolean d=score>=60&& score<=69;
        boolean f=!a&&!b&&!c&&!d&& score<=59;//boolean score>=0 && f=score<=59;
        if (a){
            System.out.println("Exellant");
        }
        if(b){
            System.out.println("Great");
        }
        if(c){
            System.out.println("Good");
        }
        if(d){
            System.out.println("Passed");
        }
        if(f){
            System.out.println("Failed");
        }



    }
}
/*
90-100==>Excellent
80-89==>Great
70-79==>Good
60-69==>Passed


 */