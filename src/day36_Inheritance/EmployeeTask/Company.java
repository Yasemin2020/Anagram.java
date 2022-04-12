package day36_Inheritance.EmployeeTask;

public class Company {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher();
        teacher1.setInfo("Ali","Teacher","BMV",'M',42,123,120000);
        Developer developer1=new Developer();
        developer1.setInfo("Veli","Developer","BMV",'M',42,124,150000);
        Driver driver1=new Driver();
        driver1.setInfo("Halil","Driver","Mercedes",'M',42,125,9000);
        Tester tester1=new Tester();
        tester1.setInfo("Ayse","SDET","BMV",'F',42,123,125000);

        teacher1.teach();
        tester1.test();
        developer1.develop();
        driver1.driver();

        System.out.println("tester1 = " + tester1);




    }



}
