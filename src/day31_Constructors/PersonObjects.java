package day31_Constructors;

public class PersonObjects {
    public static void main(String[] args) {
        Person person1 =new Person("Yasemin",'F',42);
        Person person2=new Person("Daniel",'M',32);

        System.out.println(person1);
        System.out.println(person2);
        person1.name="Jasmine";



    }
}
