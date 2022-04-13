package day15_For_Loop;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        String str=new Scanner(System.in).nextLine();
        int length=str.length();
        int sum=0;

        for (int i = 0; i < length; i++) {
            char x=str.charAt(i);
        if(x>='0'&&x<='9') sum+=x;

        }
        System.out.println("sum = " + sum);

    }
}
