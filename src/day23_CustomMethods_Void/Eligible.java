package day23_CustomMethods_Void;

public class Eligible {
    public static void main(String[] args) {
        eligibleAlchohol(25);
        eligibleToVote(20,"USA");

    }

    public static void eligibleAlchohol(int age){
        if(age>=18){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
}
    public static void eligibleToVote(int age, String citizen){
        if (age>25&&citizen.equalsIgnoreCase("usa")){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not Eligible to vote");
        }

}
/*
3. create a method that can check if a person is eligible to buy
alcohol
4. create a method that can check if a person is eligible to vote
Ex:
eligibleToVote(19, "USA");
output:
You are not eligible to vote!
 */

}