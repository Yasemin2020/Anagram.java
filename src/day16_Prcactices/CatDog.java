package day16_Prcactices;

public class CatDog {
    public static void main(String[] args) {
        int countCat=0, countDog=0;
        String str="caT dog dogG cAt";
        String str1=str.toLowerCase();
        for(int i=0;i<str1.length()-3;i++){
            if (str1.substring(i,i+2).equals("cat")){
              countCat++;
            }else if(str1.substring(i,i+2).equals("dog")) {
                countDog++;
            }
        }
        boolean catEqualsDog=countDog==countCat;
        System.out.println(catEqualsDog);


       /* write a program to print true if the string "cat" and "dog" appear the
        same number of times in the given sentence
        Ex:
        sentence = "caT dog dogG cAt"
        output:
        true*/
    }
}
