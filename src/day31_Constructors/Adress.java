package day31_Constructors;

public class Adress {
    public String  street, city, state;
    public int buildingNumber, zipCode;

    public Adress(String street, String city, String state, int buildingNumber, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.buildingNumber = buildingNumber;
        this.zipCode = zipCode;
    }
    public String toString(){
        return buildingNumber+", "+ street+ ",\n\t\t"+
         city+" "+state+", "+zipCode;
    }

    public static void main(String[] args) {
        Adress adress1=new Adress("Jones Branch Dr","McLean","Va",7925,22012);
        Adress adres2=new Adress("Hamminway Dr","Los Angles", "CA",1235,20200);
        System.out.println("adress1 = " + adress1);
        System.out.println("adres2 = " + adres2);

    }


}
/*
2.1 Create a class named Address
		    Attributes:
		         buildingNumber, street, city, state, zipCode;

		   	Add a constructor to set all the fields

		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012

 */