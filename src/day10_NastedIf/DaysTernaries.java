package day10_NastedIf;

public class DaysTernaries {
    public static void main(String[] args) {
        int n=5;
        String day;
        if (n>=1&&n<=7){

            if (n==1){ day="Monday";  }
            else if (n==2){ day= "Tuesday";}
            else if (n==3){ day= "Wednesday";}
            else if (n==4){ day= "Thursday";}
            else if (n==5){ day= "Friday";}
            else if (n==6){ day= "Saturday";}
            else { day= "Sunday";}}
        else{day="invalid";}
        System.out.println(n+". day is "+day);

        System.out.println("---------------------------------------");
        String result=(n==1)?"Monday":(n==2)?"Tuesday":(n==3)?"Wedneday":(n==4)?"Thursday":(n==5)?"Friday"
                :(n==6)?"Saturday":"Sunday";
        System.out.println("result = " + result);
    }
}
