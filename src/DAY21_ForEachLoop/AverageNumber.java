package DAY21_ForEachLoop;

public class AverageNumber {
    public static void main(String[] args) {
        int[] numbers={10,20,30,50,62,30};
        double sum=0;

        for (int number : numbers) {
            sum+=number;
        }
        double average=sum/numbers.length;

        System.out.println("average = " + average);



    }
}
