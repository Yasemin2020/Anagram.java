package week11;

public class AttributesTest {
    public static void main(String[] args) {
        Attributes atts=new Attributes();
        atts.name="cookie";
        atts.color = "brown";
        atts.amount = 10;

        System.out.println("atts.asString() = " + atts.asString());

    }
}
