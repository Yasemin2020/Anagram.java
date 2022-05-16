package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        //create a variable that's capable enough to contain five names

        String[] names=new String[5];
       // System.out.println(names);//this will give hashcode   [Ljava.lang.String;@511baa65
        names[0]="Gunay";
        names[1]="Suat";
        names[2]="Havva";
        names[3]="Ali";
        names[4]="Mikael";
        names[4]="John";

        System.out.println(Arrays.toString(names));//"Gunay", "Suat", "Havva", "Ali", "Mikael"
        System.out.println("--------------------------------------------");

        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println(Arrays.toString(days));


        System.out.println("------------------------------");

        int number=2;
        if(number<1||number>7){
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[number]);//Parantez içi index number olacak




    }
}
