package DAY12_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7: ");
        int num=scan.nextInt();
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();

        String result;//temp. you have to initialize local variables
       if (num>=1 &&num<=7){
           result=(num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wedneday":(num==4)?"Thursday"
                   :(num==5)?"Friday":(num==6)?"Saturday":"Sunday";
           }else{
            result="Invalid Number";
       }
        System.out.println("result = " + result);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        scan.close();



    }
}
