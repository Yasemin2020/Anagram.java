package day42_Exceptions;

public class MorninigWorkout {
    public static void main(String[] args) {
        System.out.println(" -----------------------Push up started-----------------");

        for (int i = 0; i <=30; i++) {
            System.out.print("\rPush up "+ i);

            try{
                Thread.sleep(1500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("\n-----------------------Push up completed-----------------");

        System.out.println(" -----------------------Pull up started-----------------");

        for (int i = 0; i <=20; i++) {
            System.out.print("\rPull up "+ i);

            try{
                Thread.sleep(2500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("\n-----------------------Pull up completed-----------------");


    }



}
