package day35_Encapsulation.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {
        //  4 testers object
        Tester tester1 = new Tester("Layan", 11, "QA", 110000 );
        Tester tester2=new Tester("Ali",43,"SDET",142000);
        Tester tester3=new Tester("Alex",44,"SE",135000);
        Tester tester4= new Tester("Lala", 23,"SDET",115000);


       Tester[] testers={tester1, tester2, tester3, tester4};
        ArrayList<Tester> testersList=new ArrayList<>();
        testersList.addAll(Arrays.asList());

        // 5 developers object

        Developer developer1 = new Developer("Olga", 22, "Java Developer", 125000);
        Developer developer2= new Developer("Aygun", 39, "Java Master", 185000);
        Developer developer3 = new Developer("Tunc", 28, "Software Developer", 135000);
        Developer developer4= new Developer("Sinem", 13, "Senior Developer",200000);

        Developer[] developers={};
        ArrayList<Developer> developersList=new ArrayList<>();
        developersList.addAll(Arrays.asList(developer1,developer2,developer3,developer4));

        //1 Scrum team object



        ScrumTeam scrum=new ScrumTeam("Nigara", "Huseyin","Neira",testersList,developersList,15);


        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);


        System.out.println(scrum);

        System.out.println("---------------------------------------------");

        scrum.removeTester(11);
        scrum.removeDeveloper(22);

        for(Tester eachTester : scrum.getTestersList()){
            System.out.println(eachTester.getName() + " : "+ eachTester.getSalary());
        }

        for (Developer eachDeveloper : scrum.getDevopsList()) {
            System.out.println(eachDeveloper.getName() +" : "+ eachDeveloper.getSalary());
        }

        System.out.println("----------------------------------------------");


        System.out.println(scrum);





    }
}
