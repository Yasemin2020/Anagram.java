package DAY31_Constructors;

public class Salary {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public Salary(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
       return hourlyRate*weeklyHours*52;
    }
    public double stateTax(){
        return salary()*stateTaxRate/100;
    }
    public double federalTax(){
        return salary()*federalTaxRate/100;
    }
    public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
    }
    public String toString(){
        return "salary= $"+salary()+
                " stateTax= $"+stateTax()+
                " federalTax= $"+federalTax()+
                " salaryAfterTax= $"+salaryAfterTax();

    }

    public static void main(String[] args) {
        Salary salary1=new Salary(10,3,2,40);
        Salary salary2=new Salary(15,3,1.5,25);

        System.out.println(salary1);
        System.out.println(salary2);
    }


}
/*
1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */