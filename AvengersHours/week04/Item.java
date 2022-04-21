package week04;

public class Item {
     /*
    In this assignment you will practice:
inheritance
constructors and calling parent class constructor
overriding
list with custom classes
Please follow the instructions on top of each method.
Work on this flow:
Item > OnSaleItem > TJMaxx
     */

    //private instance variables
    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCatalogNumber() {
        return catalogNumber;
    }

    public void setCatalogNumber(int catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Item(String name, int catalogNumber, int quantity, double price) {
        this.name = name;
        this.catalogNumber = catalogNumber;
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * public constructor with:
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     *
     * assigns to values to instance variables
     */



    /**
     * setter for name instance variable
     * @param name
     */




    /**
     * setter for private price
     * @param price
     */



    /**
     * getter for price
     * @return
     */




    /**
     * getter for name
     * @return
     */






    /**
     * Override toString:
     * @returns Object description in this format:
     * "Regular Item{name='Item name', catalogNumber=1234, quantity=5, price=9.99}"
     */

    public String toString(){
        return "Regular Item{name='"+name+"', catalogNumber="+catalogNumber+", quantity="+quantity+", price="+price+"}";
    }

    


}
