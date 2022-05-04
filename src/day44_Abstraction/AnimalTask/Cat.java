package day44_Abstraction.AnimalTask;

public class Cat extends Animal implements Playable{
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat(){
        System.out.println(getName()+" eats biryani");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing");
    }
}
