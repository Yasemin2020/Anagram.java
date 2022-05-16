package day01_JavaIntro;



public class Test {
    public static void main(String[] args) {
        try{
            System.out.println(12/0);

        }catch(ArithmeticException e){
            System.out.println("arithmatic");
        }catch(RuntimeException e) {
            System.out.println("run");
        }
    }


}
