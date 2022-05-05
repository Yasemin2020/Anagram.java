package day44_Abstraction.carTask;

public class Mercedes extends Car implements AutoPark{
    public Mercedes(String model, String color, int year, double price) {
        super("Mercedes", model, color, year, price);
    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {
        System.out.println("You are driving "+getBrand()+" "+getModel());
    }

    @Override
    public void autoPark() {
        System.out.println(getBrand()+" "+getModel()+" has auto park feature");

    }
}
