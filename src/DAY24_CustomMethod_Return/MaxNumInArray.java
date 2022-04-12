package DAY24_CustomMethod_Return;

public class MaxNumInArray {
    public static void main(String[] args) {
      int[] arr={1,2,3,4,5,6};
        System.out.println(max(arr));
        System.out.println(min(arr));

    }
    public static int max(int[] numbers){
        int max=numbers[0];
        for (int each:numbers) {
            if(each>max){
                max=each;
            }
        }
        return max;

    }
    public static int min(int[] numbers){
        int min=numbers[0];
        for (int each:numbers) {
            if(each<min){
                min=each;
            }
        }
        return min;

    }

}
