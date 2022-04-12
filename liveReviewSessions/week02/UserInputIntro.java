package week02;

import java.util.Scanner;

public class UserInputIntro {

    public static void main(String[] args) {
        //How can I receive input for my Java class

        String name="";
        //1. create your scanner object
        Scanner input=new Scanner(System.in);

        //2. Prompt the user for putting input
        System.out.println("Put your name:");// This is printed to the console

        //3. get the input
        name=input.next();

        // 4. use the value that I read
        System.out.println("name = " + name);

        //Step 1 and 3 is must, step 2 and 4 is optional
        //we need to


    }


}
