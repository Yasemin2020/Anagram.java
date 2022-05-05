package day44_Abstraction.carTask;

public class Audi extends Car implements AutoPark{
    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }
    public void start(){
        System.out.println("Push the start button");
    }

    @Override
    public void drive() {
        System.out.println("You are driving "+getBrand()+" "+getModel());
    }


    @Override
    public void autoPark(){
        System.out.println(getBrand()+" "+getModel()+" has auto park feature");
    }
}
