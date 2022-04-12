package day36_Inheritance.Sports;

public class SportObject {
    public static void main(String[] args) {
        AmericanFootball team1 = new AmericanFootball();
        team1.setInfo("American Football New England Patriots",15,7,"Hand play,four quarters 15 mins");
        System.out.println(team1);
        team1.score();

        Baseball team2 = new Baseball();
        team2.setInfo("Baseball Texas Rangers",9,4,"9 inning,break 3 hit of other team,guest team has first attack");
        System.out.println(team2);
        team2.winCup();

        Basketball team3 = new Basketball();
        team3.setInfo("Basketball Los Angeles Lakers",5,3,"10 mins game parts,24 secs attack limit,after 5 foul player is out");
        System.out.println(team3);
        team3.foul();

        Football team4 = new Football();
        team4.setInfo("Football Galatasaray",11,4,"90 mins,2. yellow card brings 1 red card,can not touch with hand");
        System.out.println(team4);
        team4.goals();


    }
}
