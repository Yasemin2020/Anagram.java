package DAY24_CustomMethod_Return;

public class BreakfastTasks {
    public static void main(String[] args) {
       initials("Yasemin Eski");
       domain("yeski@gmail.com");
       String[] emails={"josh@gmail.com","Jim@yahoo.com","Elminur@cydeo.com","Gulsen@gmail.com"};
        for (String email : emails) {
            domain(email);

        }

       months(2);
        days(5);
        howManyDays(6);


        /*
      1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

         */

    }
    public static void initials(String fullName){
        char name=fullName.charAt(0);
        char lastName=fullName.charAt(fullName.indexOf(" ")+1);
        System.out.println(name+"."+lastName+".");
    }
    public static void domain(String email){
        System.out.println("domain= "+email.substring((email.indexOf("@")+1),email.indexOf(".")));

    }
    public static void months(int number){
        if (number>=1&&number<=12) {
            String month = (number == 1) ? "Jenuary" : (number == 2) ? "February" : (number == 3) ? "March" :
                    (number == 4) ? "April" : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" :
                            (number == 8) ? "August" : (number == 9) ? "September" : (number == 10) ? "October" :
                                    (number == 11) ? "November" : "December";
            System.out.println(month);
        }else{
            System.out.println("Invalid");
        }
    }
    public static void days(int number){
        if (number>=1&&number<=7) {
            String day = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday" :
                    (number == 4) ? "Thursday" : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";

            System.out.println(day);
        }else{
            System.out.println("Invalid");
        }
    }
    static public void howManyDays(int number){

        if(number==2){
            System.out.println("28 days");
        }else if (number==4||number==6||number==9||number==11){
            System.out.println("30 days");
        }else{
            System.out.println("31 days");

    }


    }

}
