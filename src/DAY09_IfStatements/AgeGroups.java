package DAY09_IfStatements;

public class AgeGroups {
    public static void main(String[] args) {
        int age=90;
        String result="";
        if (age>=1&&age<=2)
            result="infant";
        else if(age>=3&&age<=5)
            result="Toddler";
        else if(age>=6&&age<=9)
            result="Kid";
        else if(age>=10&&age<=12)
            result="Pre-Teen";
        else if(age>=13&&age<=17)
            result="Teenager";
        else if(age>=18&&age<=20)
            result="Young Adult";
        else if(age>=21&&age<=39)
            result="Adult";
        else if(age>=40&&age<=49)
            result="Young Middle-Aged Adult";
        else if(age>=50&&age<=54)
            result="Middle-Aged Adult";
        else if(age>=55&&age<=64)
            result="Very Young Senior Citizen";
        else if(age>=65&&age<=74)
            result="Young Senior Citizen";
        else if(age>=75&&age<=84)
            result="Senior Citizen";
        else
            result="Old Senior Citizen ";
        System.out.println(result);


    }
}
