package day44_Abstraction.carTask;

public abstract class Car {
    private final String brand, model;
    private String color;
    private final int year;
    private double price;

    public Car(String brand, String model, String color, int year, double price) {

        this.brand = brand;
        if (model==null){
            throw new RuntimeException("model can not be null!");
        }
        if(model.isEmpty()){
            throw new RuntimeException("model can not be empty!");
        }
        this.model = model;
        setColor(color);

        if (year<1886){
            throw new RuntimeException("Invalid year: "+ year);
        }
        this.year = year;

        setPrice(price);
    }

    public String getBrand() {

        return brand;
    }

    public String getModel() {

        return model;
    }

    public String getColor() {
        if (color==null){
            throw new RuntimeException("color can not be null!");
        }else if(color.isEmpty()){
            throw new RuntimeException("color can not be empty!");
        }
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void setPrice(double price) {
        if (price<=0){
            throw new RuntimeException("Invalid price : "+price);
        }
        this.price = price;
    }

    public void stop(){
        System.out.println("Press the brake");
    }

    public abstract void start();
    public abstract void drive();

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

}
