package day32_Contructors;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee("Aeron");
        System.out.println(employee1);
        Employee employee2=new Employee("Yuliya",'F');
        System.out.println((employee2));
        Employee employee3=new Employee("Olga", 'F', "SDET");
        System.out.println(employee3);


    }
}
