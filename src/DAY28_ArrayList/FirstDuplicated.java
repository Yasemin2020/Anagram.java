package DAY28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicated {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

        int firstDuplicated=0;

        for (Integer each : numbers) {
            int freq=0;

            for (Integer number : numbers) {
                if(each==number){
                    freq++;
                }
            }
           if(freq>1){
              firstDuplicated=each;
              break;
           }

        }
        System.out.println(firstDuplicated);
        /*
        7. Write a program that can return the first duplicated element from an
arrayList of Integer
Ex:
list = [1,2,2,3,4,4,5,6,7,7];
output:
2
         */
    }
}
