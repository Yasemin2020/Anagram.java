package day18_Nested_Loop;

import java.util.Scanner;

public class LogInWithBreak {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter user name:");
        String userName=scan.next();
        System.out.println("Enter your password:");
        String password=scan.next();

                if(userName.equals("Cydeo")&&password.equals("WoodenSpoon")) {
                    System.out.println("Logged in");

                }else{

                    for(int i=3;i>=1;i--){//3,2,1
                    System.out.println("Incorrect user name or password. Please re-enter user name and password.\n" +
                        "You have left "+i+" attempt.");

                    System.out.println("Enter user name:");
                    userName=scan.next();

                    System.out.println("Enter your password:");
                    password=scan.next();
                        if(userName.equals("Cydeo")&&password.equals("WoodenSpoon")){
                            System.out.println("Logged in");
                            break;
                        }

                    }
                    if(!(userName.equals("Cydeo")&&password.equals("WoodenSpoon"))) {
                        System.err.println("Your account is locked");
                    }

                    }
                scan.close();



    }
}
