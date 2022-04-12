package day35_Encapsulation.encapsulation;

public class Item {
    private String name;
    private double unitPrice;
    private double quantity;

    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name.isEmpty()||name.isBlank()||name==null){
            System.out.println("Invalid name");
            System.exit(0);
        }
        String str="";
        for (char each : name.toCharArray()) {
            if(!Character.isLetterOrDigit(each)&&each!=' '){
                str+=each;
            }
            if(str.length()>0){
                System.out.println("Invalid name"+name);
                System.exit(0);
            }
            if(!Character.isLetter(name.charAt(0))){
                System.out.println("Invalid name"+name);
                System.exit(0);
            }
        }

        this.name=name;
    }


    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice<0)
            return;
        this.unitPrice = unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        if (quantity<0) {
            System.out.println("The Quantity can not be less than 0");
        }else if (getName().equalsIgnoreCase("toilet paper")&&quantity>1){
            System.out.println("Toilet Paper's quantity can not be more than 1");
        }else{
            this.quantity = quantity;
        }


    }

    public Item(String name, double unitPrice, double quantity){
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }
    public double calcCost(){
        return unitPrice*quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + calcCost() +
                '}';
    }
}

/*
4.1create a class called Item
	            private variables:
	            	name, unitPrice, quantity

            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */
