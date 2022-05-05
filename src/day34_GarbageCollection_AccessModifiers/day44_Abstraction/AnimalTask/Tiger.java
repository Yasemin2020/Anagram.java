package day34_GarbageCollection_AccessModifiers.day44_Abstraction.AnimalTask;

public class Tiger extends Animal implements WildAnimal{
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " eats deer");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" hunts deer");
    }
}
