package day40_FinalKeyword;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", "Husky", 'M', "White", "Large", 4);

        System.out.println(dog.getBreed());
        System.out.println(dog.getGender());

        dog.drink();

        Cat cat=new Cat("catty","Husky", 'M', "White", "Large", 4);

        System.out.println( cat.getName());

        cat.setName("  ");
        System.out.println(cat.getName());



    }
}
