package day07_Operators;

public class LeapYear {
    public static void main(String[] args) {
        int year=2002;

        boolean isLeapYear= (year % 4 == 0);
        System.out.println("isLeapYear = " + isLeapYear);
    }
}
