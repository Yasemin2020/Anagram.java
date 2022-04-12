package week09;

import java.util.Arrays;

public class R01_ArraysBinarySearchExample {
    public static void main(String[] args) {

        int[] nums={-5,23,123,654,2344,12345,14421};
        int indexOne= Arrays.binarySearch(nums,23);
        System.out.println(" indexOne = " +  indexOne);

        System.out.println(Arrays.binarySearch(nums, 2344 )); // sayı dizide varsa indexi verir: 4

        System.out.println(Arrays.binarySearch(nums, 25)); // sayı dizide yoksa :-3küçükten büyüğe sıralanırsa 3. sırada olurdu
        System.out.println(Arrays.binarySearch(nums, 12346));//-7

        System.out.println(Arrays.binarySearch(nums,700));//-5

        if(Arrays.binarySearch(nums, 12346)>=0){
            System.out.println("12346 is present in array");
        }else {
            System.out.println("12346 is not in the list");
        }
        int[] nums2={56,3,-67,100,1000,75};
        Arrays.sort(nums2);

        System.out.println(Arrays.binarySearch(nums2,100));//3
        System.out.println(Arrays.binarySearch(nums2,60));//-4















    }
}
