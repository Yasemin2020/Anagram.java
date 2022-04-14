package day39_Recap.animalTask;

public class Lion extends WildAnimal{

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }
    public void king(){
        System.out.println(getName()+ " is the king of jungle");
    }

}
