package DAY09_IfStatements;

import java.util.Scanner;

public class As {

        public static void main(String[] args) {
            //ENTER CODE HERE

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter cents:");

            int cent=scan.nextInt();
            int quarters=cent/25;
            int dimes= (cent%25)/10;
            int nickels=(cent-(quarters*25+dimes*10))/5;
            int pennies=cent-(quarters*25+dimes*10+nickels*5);
            System.out.println("quarters = " + quarters);
            System.out.println("dimes = " + dimes);
            System.out.println("nickels = " + nickels);
            System.out.println("pennies = " + pennies);





        }
    }


