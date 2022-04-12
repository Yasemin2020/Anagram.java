package day36_Inheritance.Sports;

public class Basketball extends Sport {
    public void foul(){
        System.out.println(getNumberOfPlayers()+" had a foul just before the end of game");
    }

}
