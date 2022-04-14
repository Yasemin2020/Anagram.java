package day39_Recap.animalTask;

public class Crocodile extends WildAnimal{
    public Crocodile(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }
    public void live(){
        System.out.println(getName()+" lives both in water and on land");
    }
}
