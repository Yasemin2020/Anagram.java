package day07_Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        String name="Steven";
        int age=19;
        String citizen="UK";

        boolean isEligible=age>=18 && citizen=="USA";//&& both
        System.out.println(name+" is eligible to vote = " + isEligible);


        String name2="Josh";
        int creditScore=720;
        int age2=23;
        int income=40000;

        boolean isEligible2=creditScore>=700 && age2>=21 && income>=60000;
        System.out.println(name2+" is eligible for loan : " + isEligible2);
        System.out.println("----------------------------------------");

        String name3="Shay";
        int age3=21;
        char gender='F';

        boolean isEligible3=age3>=18 && (gender=='M' || gender=='F');
                            //true &&  (false||true);
        System.out.println(name3+" is eligible to register = " + isEligible3);
        //-------------------------------------
        String name4="James";
        String countryOfBirth="UK";
        boolean marriedToUSCitizen=true;
        boolean isElligible4=  countryOfBirth=="USA" || marriedToUSCitizen;
        System.out.println(name4+" is elligible to apply for US citizenship= " + isElligible4);
        //------------------------------------------
        String student="Anna";
        double gpa=2.5;
        int familyIncome=60000;
        boolean isEligible5=gpa>=3.5||familyIncome<60000;
        System.out.println(student+" is eligible for scholarship: " + isEligible5);
        //----------------------
        boolean result2=true;
        System.out.println("result2 = " + result2);
        boolean result3= !result2;
        System.out.println("result3 = " + result3);
        //-------------------------------------------

        int score=50;
        boolean passed=score>=60;

        System.out.println("passed = " + passed);
        System.out.println("failed = "+ !passed);







    }
}
