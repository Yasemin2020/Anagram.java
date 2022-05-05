package day44_Abstraction.carTask;

public class Nio extends Car implements AutoPark, AutoPilot{

    public Nio(String model, String color, int year, double price) {
        super("Nio", model, color, year, price);
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

    }

    @Override
    public void drive() {
        System.out.println("You are driving "+getBrand()+" "+getModel());
    }
}
