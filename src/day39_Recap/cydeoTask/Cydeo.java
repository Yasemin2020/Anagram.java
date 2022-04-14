package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {
        Developer developer = new Developer("Korkmaz", 29, 'M', 1, "Java Developer", 125000);

        Tester tester = new Tester("Olga", 27, 'F', 2, "SDET", 110000);

        Teacher teacher = new Teacher("Daniel", 32, 'M', 3, "Math Teacher", 100000);

        Student student = new Student("Suhaib", 30, 'M', 8, "SDET" );


        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        developer.setAge(39);
        System.out.println(developer.getAge());
        System.out.println(developer);
        
        developer.work();
        tester.work();
        teacher.work();
        
        
        developer.eat();
        developer.drink();
        developer.sleep();
        
        developer.fixingBugs();
        
        tester.eat();
        tester.drink();
        tester.sleep();
        
        tester.createTicket();

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        student.eat();
        student.drink();
        student.sleep();

        student.study();
        


    }

}
/*

    7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes
 */
