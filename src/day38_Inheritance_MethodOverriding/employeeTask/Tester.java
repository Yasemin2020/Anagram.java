package day38_Inheritance_MethodOverriding.employeeTask;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, id, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(name+ " is testing");
    }
}
