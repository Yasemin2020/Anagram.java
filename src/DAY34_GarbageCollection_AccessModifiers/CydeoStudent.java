package DAY34_GarbageCollection_AccessModifiers;

public class CydeoStudent {

    public String studentName;
    public static String schoolName;

    public CydeoStudent(String studentName) {
        this.studentName = studentName;


    }
    static{
        schoolName="Cydeo School";
    }

    public String toString() {
        return "CydeoStudent{" +
                "studentName='" + studentName + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}

class CydeoStudentObject{
    public static void main(String[] args) {
        CydeoStudent student1=new CydeoStudent("Jimmy");
        CydeoStudent student2=new CydeoStudent("Kathy");
        System.out.println(student1);

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);



    }

}