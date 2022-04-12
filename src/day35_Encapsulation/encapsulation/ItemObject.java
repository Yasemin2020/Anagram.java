package day35_Encapsulation.encapsulation;

public class ItemObject {
    public static void main(String[] args) {
        Item item1=new Item("Tomato Soup",15,2);
       Item item2=new Item("cookies",45,1);
        System.out.println("item1 = " + item1);
       System.out.println("item2 = " + item2);
        Item item3=new Item("toilet paper",15,2);
        System.out.println("item3 = " + item3);

    }
}
