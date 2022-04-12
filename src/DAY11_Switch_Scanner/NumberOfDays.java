package DAY11_Switch_Scanner;

import java.sql.SQLOutput;

public class NumberOfDays {
    public static void main(String[] args) {
        int year=2000;
        int month=2;
        String result="";
        if (month>=1&&month<=12){
            switch (month){
                case 2:
                    result=(year%4==0)?"29 days":"28 days";
                    break;

                case 4: case 6: case 9: case 11:
                    result="30 days";
                    break;

                default:
                    result="31 days";}

            }else{
            result="Invalid Number";
        }
        System.out.println("result = " + result);

    }
}
