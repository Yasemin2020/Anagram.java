package day38_Inheritance_MethodOverriding.EmployeeTask;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1=new Employee("Ali", 25,'M',123,110000,"IBM");
        employee1.work();

        ProductOwner productOwner=new ProductOwner("Harry", 42,'M',124,150000,"Collins");
        productOwner.work();

    }


}
