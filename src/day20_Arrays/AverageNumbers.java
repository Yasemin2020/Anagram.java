package day20_Arrays;

public class AverageNumbers {
    public static void main(String[] args) {
        int[] numbers={10,20,30,50,62,30};
        double total=0;

        for (int i = 0; i < numbers.length; i++) {
            total+=numbers[i];

        }
        System.out.println("Average is= "+(total/numbers.length));





    }
}
