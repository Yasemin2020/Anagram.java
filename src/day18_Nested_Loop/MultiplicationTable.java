package day18_Nested_Loop;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {

            for (int j = 1; j <=10 ; j++) {
                System.out.print(i*j);
                System.out.print((i*j>9)?"    ":"     ");
            }

            System.out.println();

        }

    }
}
