package day52_Map_Functional_Interface;

//lambda: () -> {}

public class Test {
    public static void main(String[] args) {
        // function1: create a function that can display a number is odd
        MyFirstFunctionalInterface oddOrEvenNumber=(n)->{
            if(n%2==0){
                System.out.println(n+ " is even number");
            }else{
                System.out.println(n+ " is odd number");
            }
        };

        oddOrEvenNumber.apply(20);

        // function2: create a function that can check if a person is eligible to buy alcohol
        MyFirstFunctionalInterface eligibleToBuyAlcohol;
        eligibleToBuyAlcohol=(age)->{
            if(age>=21){
                System.out.println("Eligible to buy alcohol");
            }else{
                System.out.println("Not eligible to buy alcohol");
            }
        };

        eligibleToBuyAlcohol.apply(20);


        //function3: create a function that can display the cube of a number
        MyFirstFunctionalInterface printCube;

        printCube= n->System.out.println(n*n*n);// no need parantheses because there is only on parameter in (), and
        //one statement in {}
        printCube.apply(30);


        //function4: create a function that can check if a number is evenly divisable by  3 & 5
        MyFirstFunctionalInterface divisibleBy3and5 = n -> {
            if(n%15==0){
                System.out.println(n+ " is divisible by 3 and 5");
            }else{
                System.out.println(n+ " is not divisible by 3 and 5");
            }
        };

        divisibleBy3and5.apply(30);



    }
}
