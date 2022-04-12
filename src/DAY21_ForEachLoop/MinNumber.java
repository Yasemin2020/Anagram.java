package DAY21_ForEachLoop;

public class MinNumber {
    public static void main(String[] args) {
        int[] numbers={10,20,30,65,-23,15};
        int min=numbers[0];
        for(int each:numbers){
            if(each<min){
                min=each;
            }
        }

        System.out.println("min = " + min);
        
    }
}
