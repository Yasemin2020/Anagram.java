package DAY14_String;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        /*
        Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your e-mail address: ");
        String email=scan.next();

        String firstName=email.substring(0,email.indexOf("_"));
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1);

        String lastName=email.substring(email.indexOf("_")+1,email.indexOf("@")).substring(0,1).toUpperCase()+
                email.substring(email.indexOf("_")+1,email.indexOf("@")).substring(1);

        String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("domain = " + domain);


    }

}
