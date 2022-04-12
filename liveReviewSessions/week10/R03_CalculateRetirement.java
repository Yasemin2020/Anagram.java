package week10;

public class R03_CalculateRetirement {
    public static void main(String[] args) {
        yearsUntilRetirement("Yasemin", 1980);

    }
    //calculate age of a person
    public static int calculateAge(int birthYear){

        return 2022-birthYear;
    }
    //lets assume 65 is retirement age
    public static void yearsUntilRetirement(String name, int yearOfBirth){
        int yearsUntilRetirement =65-calculateAge(yearOfBirth);
        System.out.println(name+ " retires in "+yearsUntilRetirement+" years");
    }

}
