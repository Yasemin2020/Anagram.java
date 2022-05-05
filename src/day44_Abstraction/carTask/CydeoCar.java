package day44_Abstraction.carTask;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable{

    public CydeoCar(String model, String color, int year, double price) {
        super("CydeoCar", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println(getBrand()+" "+getModel()+ " has auto parking feature");

    }

    @Override
    public void selfDrive() {
        System.out.println(getBrand()+" "+getModel()+ " has auto pilot feature");
    }

    @Override
    public void start() {
        System.out.println("Push start button");

    }

    @Override
    public void drive() {
        System.out.println("You are driving "+getBrand()+" "+getModel());

    }

    @Override
    public void fly() {
        System.out.println("You are flying");
    }

}
