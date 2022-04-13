package day20_Arrays;

public class Months {
    public static void main(String[] args) {
        String[] months={"Jenuary","February","March","April","May","June","July","August","September","October",
                "November","December"};
        //System.out.println(months[4]);//May
       // System.out.println(months[11]);//December
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);

        }
        System.out.println("-----------------------------------------");
        for (int i = months.length-1; i >=0 ; i--) {
            System.out.println(months[i]);
        }


    }
}
