package day20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {
        int[] numbers={10,20,30,350,62,23};
        int max=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
                max=numbers[i];
            }

        }
        System.out.println("Max number is: "+ max);







    }
}
