package day08_IfStatement;

public class Days {
    public static void main(String[] args) {
        int n=4;
        String day;
        if (n==1){ day="Monday";  }
        else if (n==2){ day= "Tuesday";}
        else if (n==3){ day= "Wednesday";}
        else if (n==4){ day= "Thursday";}
        else if (n==5){ day= "Friday";}
        else if (n==6){ day= "Saturday";}
        else if (n==7){ day= "Sunday";}
        else{day="invalid";}
        System.out.println(n+". day is "+day);




    }
}
