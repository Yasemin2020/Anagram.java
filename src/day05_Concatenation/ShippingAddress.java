package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name="Yasemin Eski",
                buildingNumber="7A",
                streetName="Nergis sokak",
                city="Denizli",
                country="Turkey",
                zipCode="20100A";
        String address=name+"\n"+buildingNumber+" "+streetName+"\n"+city+"/"+country+"\n"+zipCode;
        System.out.println(address);


        //System.out.println("Shipping Adress :\n"+name+"\n"+buildingNumber+" "+streetName+"\n"+city+"/"+country+"\n"+zipCode);

        /*
        Create a class called ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full address
         */
    }
}
