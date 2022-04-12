package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1=+25;
        int num2=-25;
        System.out.println(num1<0);//false
        System.out.println(num2<0);//true

        System.out.println("----------------");
        int a=5;
        System.out.println(++a);//preincrement increases the value by 1 immediately
        System.out.println(--a);//pre decrement decreases the value by 1 immediately
        System.out.println(--a);

        int b=100;
        System.out.println(b++);//100 postpone the increment by 1-işlemden sonra artırır
        System.out.println(b);//101
        System.out.println("-------------------------------------");

        int x=200;
        System.out.println(x--);//200 postpone the decrement by 1-işlemden sonra azaltır
        System.out.println(x);//199

        int z=45;
        System.out.println(++z);//46
        System.out.println(z++);//46
        System.out.println(z);//47

        int q=30;
        System.out.println();

    }
}
