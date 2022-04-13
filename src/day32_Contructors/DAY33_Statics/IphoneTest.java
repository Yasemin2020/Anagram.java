package day32_Contructors.DAY33_Statics;

public class IphoneTest {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("iphone 12", 1000,"Black", "5.6 inches");
        System.out.println(iphone1);
        iphone1.faceTime(532859654);
        iphone1.faceTime("cydeo@email.com");
        iphone1.call(532859654);
        iphone1.text(532859654);

    }
}