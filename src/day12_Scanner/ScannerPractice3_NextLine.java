package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName=input.nextLine();

        System.out.println("Enter your programming Language: ");
        String programming= input.nextLine();

        System.out.println("Enter your age: ");
        int age=input.nextInt();//24Enter---it only reads 24. Enter isnt read.
        // It is left in the scanner's memory
        // Enterı okul ismi yerine okur. önlemk için boş bir nextLine oluştur.
        System.out.println("Enter your school number: ");
        int number=input.nextInt();
        input.nextLine();


        System.out.println("Enter your school name: ");
        String schoolName=input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming= "+programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);




    }
}
