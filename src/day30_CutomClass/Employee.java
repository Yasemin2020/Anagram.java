package day30_CutomClass;

public class Employee {

    public String name;
    public char gender;
    public int age;
    public int id;
    public String jobtitle;
    public double salary;
    public boolean isFullTime;

    public void setInfo(String name, char gender, int age, int id, String jobtitle, double salary, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.jobtitle = jobtitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work(){
        System.out.println(jobtitle+" "+ name+ " is working");
    }


}
/*
Employee Class:
		Attributes:
			name, id, gender, jobTitle, salary, isFullTime(boolean)
		Actions:
			toString(): to be able to print each employee object
			setInfo(): to be able to set all the attributes
			work()...
 */