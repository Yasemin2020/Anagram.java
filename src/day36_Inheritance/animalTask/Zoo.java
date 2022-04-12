package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setInfo("Max","Husky",'M',2,"Small","White");
        dog.eat();
        dog.drink();
        dog.move();
        dog.sleep();
        dog.bark();




        Cat cat=new Cat();
        cat.setInfo("Tarcin","British",'M',3,"Small","brown");

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        cat.scratch();
        cat.meow();


        Tiger tiger=new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "Orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        tiger.roar();
        tiger.hunt();

        System.out.println("tiger = " + tiger);
    }
}
