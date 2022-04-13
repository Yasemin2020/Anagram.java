package day21_ForEachLoop;

public class EvenOddInArray {
    public static void main(String[] args) {
     int[] numbers={11,35,62,45,85,68,59,60};
        int even=0;
        int odd=0;

        for(int each:numbers){
            if(each%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("odd = " + odd);
        System.out.println("even = " + even);

/*
2. Write a program that can count the even and odd number from an
array of integers
Note: MUST use for each loop
 */


    }
}
