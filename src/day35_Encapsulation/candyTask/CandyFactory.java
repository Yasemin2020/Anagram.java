package day35_Encapsulation.candyTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {
       Candy candy1=new Candy("Ulker",2, 0,true);
       Candy candy2=new Candy("Nestle",1, 50,true);
       Candy candy3=new Candy("Kinder",2, 30,false);
       Candy candy4=new Candy("Eti",1, 45,true);
       Candy candy5=new Candy("Milka",3, 25,true);

        ArrayList<Candy> list=new ArrayList<>();
        list.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy1));

        for (Candy each : list) {
            if (each.getPrice()==0){
                System.out.println(each.getBrand()+" : free");
            }else {
                System.out.println(each.getBrand() + " : " + each.getPrice()+" : "+each.calcCost());
            }
        }

    }


}
/*
  1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy

 */