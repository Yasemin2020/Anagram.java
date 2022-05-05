package day44_Abstraction.carTask;

public final class Tesla extends Car implements AutoPark, AutoPilot{
    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }
    public void start(){
        System.out.println("Say start");
    }

    @Override
    public void drive() {
        System.out.println("You are driving "+getBrand()+" "+getModel());

    }

    @Override
    public void autoPark() {
        System.out.println(getBrand()+" "+getModel()+ " has auto parking feature");


    }

    @Override
    public void selfDrive() {
        System.out.println(getBrand()+" "+getModel()+ " has auto pilot feature");

    }
}
