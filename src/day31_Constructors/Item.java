package day31_Constructors;

public class Item {
    public String name;
    public double unitPrice;
    public double quantitiy;

    public Item(String name, double unitPrice, double quantitiy) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantitiy = quantitiy;
    }
    public double calcCost(){
        return unitPrice*quantitiy;
    }

    public String toString() {
        return "item ='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                "TL , quantitiy=" + quantitiy +
                "kg , total price" + calcCost() +"TL";
    }

    public static void main(String[] args) {
        Item item1=new Item("Tomato", 10,3);
        System.out.println(item1);
    }


}
/*
4. Item Task:
		4.1 Create a class called Item
            Attributes:
                name, unitPrice, quantity

            Add a constructor to initialize all the fields

            Methods:
                calcCost(): returns the total price of the Item
                toString(): retuns the name, unitPrice, quantity and total Price that's calculated by calcCost()


 */