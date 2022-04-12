package day08_IfStatement;

public class Months {
    public static void main(String[] args) {
        int no = 9;
        String month;
        if (no == 1) {
            month = "Jenuary";
        } else if (no == 2) {
            month = "February";
        } else if (no==3){
            month="March";
        } else if (no==4){
            month="April";
        } else if(no==5){
            month="May";
        } else if(no==6){
            month="June";
        } else if(no==7){
            month="July";
        } else if(no==8){
            month="August";
        } else if(no==9){
            month="September";
        }else if(no==10){
            month="October";
        } else if(no==11){
            month="November";
        } else if(no==12){
            month="December";
        } else
            month="Invalid";
        System.out.println(no+". month is "+month);



    }}