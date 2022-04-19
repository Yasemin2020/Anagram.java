package day42_Exceptions;

public class MorningWorkOut2 {
    public static void main(String[] args) {
        System.out.println(" -----------------------Push up started-----------------");

        for (int i = 0; i <=30; i++) {
            System.out.print("\rPush up "+ i);
            sleep(1.5);

        }
        System.out.println("\n-----------------------Push up completed-----------------");

        System.out.println(" -----------------------Pull up started-----------------");

        for (int i = 0; i <=20; i++) {
            System.out.print("\rPull up "+ i);
            sleep(2.5);

        }
        System.out.println("\n-----------------------Pull up completed-----------------");


    }


    public static void sleep(double seconds){
        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
