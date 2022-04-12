package day01_JavaIntro;



public class Test2 {
    public static void main(String[] args) {
     int x=5;
     while(sum(x)){
         System.out.print(x);
         x--;
     }

    }

    public static boolean sum(int a){

        return (a>0)?true:false;
    }

}
