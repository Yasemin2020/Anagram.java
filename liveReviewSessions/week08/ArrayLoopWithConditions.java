package week08;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices= {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        for(double eachPrice:prices){
            System.out.println("eachPrice = " + eachPrice);
        }
        for(double price:prices){
            if(price>100.0){
                System.out.println("price = " + price);
            }
        }
        System.out.println("---------------------prices between 10 and 70 inclusive----------");
        for(double price2:prices){
            if(price2>=10&&price2<70.0){
                System.out.println("price2 = " + price2);
            }
        }

        System.out.println("--------count of the prices that are more than 50 -----------");
        int count=0;

        for(double price3:prices){
            if(price3>50.0){
               count++;
            }
        }

        System.out.println("count of the prices that are more than 50 is " + count);






    }
}
