package DAY17_While_DoWhile;

import java.util.Scanner;

public class ElligibleToVote {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=scan.nextInt();

        while(!(age>=1&&age<=120)){
            System.err.println("Invalid entry,please re-enter:");
            age=scan.nextInt();

        }
        System.out.println("Are you a citizen? yes/no");
        String answer=scan.next().toLowerCase();
        while(!(answer.equals("yes")||answer.equals("no"))){
            System.err.println("Invalid entry, pelease re-enter:");
            answer=scan.next().toLowerCase();
        }
        if (age>=18&&answer.equals("yes")){
            System.out.println("You are eligible to vote.");
        }else{
            System.out.println("You are not eligible to vote.");
        }


    }
}