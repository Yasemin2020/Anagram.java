package DAY18_Nested_Loop;

public class Triangle2 {
    public static void main(String[] args) {

          for (int i = 1; i <9 ; i++) {

                for (int j = 1; j <=8-i ; j++) {
                    System.out.print(" ");

                }
                 for (int j = 1; j <i+1; j++) {
                     System.out.print("*");
                }
                System.out.println();

          }
    }
}
