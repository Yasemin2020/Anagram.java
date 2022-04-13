package day16_Prcactices;

public class ReverseStr {
    public static void main(String[] args) {
        String str="Wooden Spoon";
        int length=str.length();
        String result="";


        for (int i = 1; i <=length ; i++) {
            result+=str.charAt(str.length()-i);//n

        }
        System.out.println( result);


    }
}
