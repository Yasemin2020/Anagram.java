package day33_Statics;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1=new Dog("Lucy", "Husky", "Small", "White", 'F',  4);
        System.out.println("dog1 = " + dog1);

        dog1.eat();
        dog1.sleep();
        dog1.play();

    }
}
