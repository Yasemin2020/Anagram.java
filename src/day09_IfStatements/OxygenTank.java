package day09_IfStatements;

public class OxygenTank {
    public static void main(String[] args) {
        /*
        Create a class called OxygenTank. You are diving in the ocean. Your
oxygen tank has a certain level (number) and you must print a message
based on the level:
Above 90 -  Your tank is full
Above 80 -  Still okay
Above 70 -  Don't go too far
Above 60 -  Start to head back
Above 50 -  Be careful now you at at 50%
         */
        int level=20;
        String result="";
        if (level>90)
            result="Your tank is full";
        else if(level>80)
            result="Still okay";
        else if(level>70)
            result="Don't go too far";
        else if(level>60)
            result="Start to head back";
        else if (level>=50)
            result="Be careful now you are at 50%";
        else
            result="Your tank is nearly empty";

        System.out.println("result = " + result);
    }
}
