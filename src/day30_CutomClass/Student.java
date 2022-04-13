package day30_CutomClass;

public class Student {
    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;

    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;

    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void coding(){
        System.out.println(name+ " is coding");
    }
    public void sleeping(){
        System.out.println(name+" is sleeping");
    }


}
