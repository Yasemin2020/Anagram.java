package day34_GarbageCollection_AccessModifiers.day44_Abstraction.AnimalTask;

public class Eagle extends Animal implements WildAnimal, Flyable{
    public Eagle(String name, String breed, char gender, int age, String size, String color){
        super(name, breed, gender, age , size, color);
    }
    public void eat(){
        System.out.println(getName()+ " eats snake");
    }
    public void hunt(){
        System.out.println(getName()+" hunts snake");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" can fly 50km/h");
    }

}
