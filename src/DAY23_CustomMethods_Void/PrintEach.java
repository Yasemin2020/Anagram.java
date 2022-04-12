package DAY23_CustomMethods_Void;

public class PrintEach {
    public static void main(String[] args) {
        printEachChar("Java");
        printEachElement(new int[] {12,23,21,20});
       /*
        13. create a method named printEachChar that can print each
characters of a string
14. create a method named printEachElement that can print each
elements of an integer array
        */

    }
    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
    }
    public static void printEachElement(int[] numbers){
        for (int number : numbers) {
            System.out.print(number+" ");

        }
    }
}
