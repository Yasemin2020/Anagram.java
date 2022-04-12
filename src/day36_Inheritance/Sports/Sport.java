package day36_Inheritance.Sports;

public class Sport {
    private String name;
    private int numberOfPlayers, numberOfRefree;
    private String rules;



    public void setInfo(String name, int numberOfPlayers, int numberOfRefree, String rules) {
        setName(name);
        setNumberOfPlayers(numberOfPlayers);
        setNumberOfRefree(numberOfRefree);
        setRules(rules);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfRefree() {
        return numberOfRefree;
    }

    public void setNumberOfRefree(int numberOfRefree) {
        this.numberOfRefree = numberOfRefree;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }
    public void play(){
        System.out.println(getName()+ " is playing");
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfRefree=" + numberOfRefree +
                ", rules='" + rules + '\'' +
                '}';
    }
}
/*
 Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfReferre, rules



			methods:
				setInfo()
				play()
				toString()

 */