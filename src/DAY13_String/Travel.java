package DAY13_String;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Do you have a valid passport? (yes or no)");
        String passport=scan.next();
        scan.nextLine();

        int costAmount=0;

        if (passport.equals("yes")) {
            System.out.println("Which country are you going to travel?");
            String country=scan.nextLine();
            System.out.println("How many bags will you take with you? ");
            byte bags= scan.nextByte();
            System.out.println("How many people will you travel with?");
            short accompony= scan.nextShort();
            if (accompony <= 3)
                costAmount = 1000 + bags * 50 + 1000 * accompony - 100 * accompony;
            else
                costAmount = 1000 + bags * 50 + 1000 * accompony - 300;
            System.out.println("Your ticket is booked to " + country + ". We have charged extra for the " + bags +
                    " bags but you are traveling with " + accompony + " people so we are giving a discount. " +
                    "Your total cost is " + costAmount);
        }else{
            System.out.println("When was your passport expired? ");
            int year= scan.nextInt();
            int expiredYears=2022-year;
            System.out.println("Which country do you plan to travel?");
            scan.nextLine();
            String allCountry= scan.nextLine();
            System.out.println("Will you travel next year?");
            String nextYear=scan.nextLine();

            if (nextYear.equals("Yes")) {
                costAmount = costAmount + 200 + 75 * expiredYears+100;
            }else{
                costAmount=costAmount+200+75*expiredYears-50;

                }
            scan.close();


            System.out.println("Looks like your password has been expired for "+expiredYears+
                    " years but not to worry we will get it ready for you to " +
                    "travel to "+allCountry+". Your total cost has come out to "+costAmount);


            }




        }






    }

