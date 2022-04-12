package DAY08_IfStatement;

public class DaysOfMonth {
    public static void main(String[] args) {
        int n= 2;
        if (n==1||n==3||n==5||n==7||n==8||n==10||n==12){
            System.out.println(n+". month has 31 Days");        }
        else if(n==4||n==6||n==9||n==11){
            System.out.println(n+". month has 30 Days");        }
        else {
            System.out.println(n+". month has 28 Days");
        }






    }
}
