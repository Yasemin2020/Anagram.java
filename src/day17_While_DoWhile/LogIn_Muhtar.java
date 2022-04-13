package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn_Muhtar {

    public static void main(String[] args) {


            Scanner scan=new Scanner(System.in);
            System.out.println("Enter user name:");
            String userName=scan.nextLine();
            System.out.println("Enter your password:");
            String password=scan.nextLine();
        int attempt=3;
        if(userName.equals("Cydeo")&&password.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            while((!(userName.equals("Cydeo")&&password.equals("Cydeo123")))&&--attempt>0){

                System.out.println("Incorrect user name or password. Please re-enter user name and password.\n" +
                        "You have left "+attempt+" attempt.");
                System.out.println("Enter user name:");
                userName=scan.nextLine();
                System.out.println("Enter your password:");
                password=scan.nextLine();

            }
            scan.close();
                System.out.println("Your account is locked");

    }

}}