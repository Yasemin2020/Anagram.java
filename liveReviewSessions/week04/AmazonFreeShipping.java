package week04;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        double totalPrice = 55.50;
        if (totalPrice >= 25) {
            System.out.println("FREE SHIPPING ELLIGIBLE. Your order total:$ " + totalPrice);
        } else {
            System.out.println("NOT ELLIGIBLE FOR FREE SHIPPING:$ " + totalPrice);
        }
        System.out.println("Thanks for shopping with us!");
    }
}
