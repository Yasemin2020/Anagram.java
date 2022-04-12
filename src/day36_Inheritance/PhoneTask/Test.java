package day36_Inheritance.PhoneTask;

public class Test {
    public static void main(String[] args) {
        Samsung samsung=new Samsung();
        samsung.setInfo("Samsung","J7","Small","Golden",70);

        Iphone iphone = new Iphone();
        iphone.setInfo("iphone 12", "11","5.6 inches", "Black",1000);

        Samsung samsung2 = new Samsung();
        samsung.setInfo("galaxy S19", "S6","6 inches", "White", 900);

        Nokia nokia = new Nokia();
        nokia.setInfo("Brik", "3210","4 inches", "Pink", 60);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);


    }


}
/*

 */