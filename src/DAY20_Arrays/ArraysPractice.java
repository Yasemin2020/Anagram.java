package DAY20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] numbers={10,20,50,70};
        System.out.println(Arrays.toString(numbers));
        System.out.println("---------------------------------");
        //create a variable that can contain 5 scores

        int[] scores=new int[5];


        scores[1]=85;
        scores[2]=56;
        scores[scores.length-1]=95;//assigning last score
        scores[0]=56;
        scores[3]=56;
        System.out.println(Arrays.toString(scores));














    }
}
