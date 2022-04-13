package day23_CustomMethods_Void;

public class PositiveOrZero {
    public static void main(String[] args) {
        positiveOrNegative(-25);
    }
    /*
    create a method that can if the given integer is positive,
negative or zero
     */
    public static void positiveOrNegative(int number){
        if(number>0){
            System.out.println(number+" is positive");
        }else if(number<0){
            System.out.println(number+" is negative");
        }else{
            System.out.println(number+" is zero");
        }
    }

}
