package day44_Abstraction.Device;

public abstract class Device {
    private final String brand, model;
    private double price;
    private String color;
    private final String size;

    public Device(String brand, String model, double price, String color, String size) {

        if (brand==null){
            throw new RuntimeException("brand can not be null!");
        }
        if(brand.isEmpty()){
            throw new RuntimeException("brand can not be empty!");
        }
        this.brand = brand;
        if (model==null){
            throw new RuntimeException("model can not be null!");
        }  
        if(model.isEmpty()){
            throw new RuntimeException("model can not be empty!");
        }
        
        this.model = model;
        this.price = price;
        setColor(color);

        if (size==null){
            throw new RuntimeException("size can not be null!");
        }
        if(size.isEmpty()){
            throw new RuntimeException("size can not be empty!");
        }
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            throw new RuntimeException("Price can not be less than zero!");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color==null){
            throw new RuntimeException("color can not be null!");
        }
        if(color.isEmpty()){
            throw new RuntimeException("color can not be empty!");
        }
        this.color = color;
    }

    public String getSize() {
        return size;
    }


    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
