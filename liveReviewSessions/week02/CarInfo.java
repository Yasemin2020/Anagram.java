package week02;

public class CarInfo {
    public static void main(String[] args) {
        int year=2015;
        String make="Audi";
        String model="A6";
        boolean transmission=true;//automatic=true, manuel=false
        String color="blue";
        int milage=0;
        int price=100_000;

        System.out.println(year+" "+make+" "+model+"\nAutomatic Transmission:"+transmission);
        System.out.println(color+"|"+milage+"kilometers|"+price+"Euros");
        //Lets turn this value into TL 1Euro=.TL
        double priceInTL=price*15.5;
        double taxRate=1.80;//for this kind of cars
        double priceAfterTaxInTL=priceInTL+(priceInTL*taxRate);
        System.out.println(priceAfterTaxInTL);



    }

}
