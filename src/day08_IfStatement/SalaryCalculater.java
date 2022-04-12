package day08_IfStatement;

public class SalaryCalculater {
    public static void main(String[] args) {
        int hourlyRate=50;
        int weeklyHour=45;
        double stateTextRate=6.5,
        federalTextRate=26.5;
        //-----------------------------
        int salaryBeforeTax=hourlyRate*weeklyHour*52;
        double stateTax=salaryBeforeTax*stateTextRate/100;
        double federalTax=salaryBeforeTax*federalTextRate/100;
        double totalTax=stateTax+federalTax;
        double salaryAfterTax=salaryBeforeTax-totalTax;



        System.out.println("Gross pay is: $"+salaryBeforeTax);
        System.out.println("State Tax = $" + stateTax);
        System.out.println("Federal Tax = $" + federalTax);
        System.out.println("Total Tax = $" + totalTax);
        System.out.println("Net Income= $"+salaryAfterTax);




        /*
        Create a class called SalaryCalculator.java
3.1 declare the following variables:
hourlyRate, weeklyHours,
stateTaxRate, federalTaxRate
3.2 use the given info in above variables to
calculate the followings:
1. salaryBeforeTax
2. stateTax
3. federalTax
4. totalTax
5. salaryAfterTax
Hint: salaryBeforeTax =
hourlyRate * weeklyHour * 52
3.3 use print statement to print each of the
above
Ex:
   hourlyRate = $50
   weeklyHours = 45
   stateTaxRate = 6
(given as percentage, you need to convert to decimal)
   federalTaxRate = 26
(given as percentage, you need to convert to decimal)
    output:
    Gross pay is: $117000
    Federal tax is: $30420
    State tax is: $7020
    Total tax is: $37440
    Net income is: 79560
         */
    }
}
