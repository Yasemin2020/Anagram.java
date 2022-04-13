package day15_For_Loop;

public class ForLoopPractices {
    public static void main(String[] args) {
        for(int n=15;n<=45;n++){
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println("Hello!");
        for(int i=100;i>=50;i--){
            System.out.print(i+" ");
        }
        System.out.println("--------------------------------------------");
        for(int i=1;i<55;i++){
            if(i%2==0)
                System.out.print(i+" ");
        }
        System.out.println();

        for(int i=2; i<55; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=1;2*i<55; i++){
            System.out.print(2*i+" ");
        }





    }

}
