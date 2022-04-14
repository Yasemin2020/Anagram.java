package day39_Recap.animalTask;

public class Python extends WildAnimal{

    public Python(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }
    public void power(){
        System.out.println(getName()+ " is very powerful ");
    }

}
