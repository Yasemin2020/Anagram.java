package DAY33_Statics;

public class CydeoStudentTest {
    public static void main(String[] args) {
        CydeoStudent student1=new CydeoStudent("Ali",45,123,12,4,'M','A');
        CydeoStudent student2=new CydeoStudent("Veli",35,153,12,4,'M','B');
        CydeoStudent student3=new CydeoStudent("Ayse",25,223,12,4,'F','A');
        System.out.println(student1);

        student1.attendClass();
        student2.study();
        student1.printSchoolName();
        student2.printSchoolName();

        student1.printProgLanguage();
        student3.printProgLanguage();

    }

}
