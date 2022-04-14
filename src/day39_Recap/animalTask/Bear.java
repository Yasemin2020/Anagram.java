package day39_Recap.animalTask;

public class Bear extends WildAnimal{

    public Bear(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }
    public void hybernation(){
        System.out.println(getName()+ " hybernates for 6 months ");
    }

}
