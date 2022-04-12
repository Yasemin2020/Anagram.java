package day04_Variables;

public class SalaryCalculater {
    public static void main(String[] args) {
        //hourly rate, weekly hours
        int hourlyRate=50;
        int weeklyHours=40;
        int numberOfWeeks=52;

        int salary=hourlyRate*weeklyHours*numberOfWeeks;
        System.out.println(salary);
        System.out.println("Hourly Rate: $"+hourlyRate);
        System.out.println("Weekly Hours: "+weeklyHours);
        System.out.println("Weeks: "+numberOfWeeks);
        System.out.println("salary = $" + salary);
    }
}
