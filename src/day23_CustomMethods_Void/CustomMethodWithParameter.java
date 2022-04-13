package day23_CustomMethods_Void;

public class CustomMethodWithParameter {
    public static void main(String[] args) {
        oddOrEven(15);
        System.out.println("--------------------------------");
        int birthYear=1950;
        ageOfPerson(birthYear);
        printNumbers(10,50);
    }

    //create a function that can check if a number is odd or even
    public static void oddOrEven (int number){
        if(number%2==0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+" is odd number");
        }
        //oddOrEven();//the method demands additional information

    }
    //create a function that can display the age of the person
    public static void ageOfPerson (int birthYear){
        int age=2021-birthYear;
        System.out.println("ageOfPerson = " + age);

    }

    //create a function that can print all the numbers between X and Y
    public static void printNumbers(int x,int y){
        for (int i = x+1; i <y ; i++) {
            System.out.print(i+" ");

        }

    }


}
