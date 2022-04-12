package day09_IfStatements;

public class MaxNumber {
    public static void main(String[] args) {
        int a=45, b=52;
        if (a>b){
            System.out.println(a+ " is maximum");
        }
        else if(b>a){
            System.out.println(b+" is maximum");
        }
        else{
            System.out.println("Equal");
        }

    }
}
