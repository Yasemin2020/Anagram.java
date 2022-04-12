package day35_Encapsulation.encapsulation;

public class Carpet {
    private double width;
    private double length;
    private double unitPrice;
    private boolean isParsian;
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        if(width<=0)
            return;
        this.width=width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<=0)
            return;
        this.length = length;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice<0)
            return;
        this.unitPrice = unitPrice;
    }

    public boolean isParsian() {
        return isParsian;
    }

    public void setParsian(boolean parsian) {
        isParsian = parsian;
    }
    public Carpet(double width, double length, double unitPrice, boolean isParsian){
        setLength(length);
        setWidth(width);
        setUnitPrice(unitPrice);
        setParsian(isParsian);
    }
    public double calcCost(){
        double totalPrice = (width*length)*unitPrice;
        if (isParsian)
            totalPrice=totalPrice+200;
        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", isParsian=" + isParsian +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + calcCost() +
                '}';
    }
}
/*
 Carpet Task
		3.1create a class named Carpet:
                private variables:
                        width, length, unitPrice, isPersian (boolean)

                Encapsulate all the fields:
                		Conditions:
                			width can not be negative
                			width can not be negative
                			unit price can not be negative

		Add a constructor to set all the instances
                instance methods:
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet = (width*length)*unitPrice
            if the carpet is persian  carpet, add 200$ to the totalPrice
 */