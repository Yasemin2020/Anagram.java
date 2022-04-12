package DAY23_CustomMethods_Void;

public class GradeScore {
    public static void main(String[] args) {
        gradeScore(36);

    }

    public static void gradeScore(int score){
        String grade=(score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";
        System.out.println(grade);
    }
    /*
    create a method that can calculate the grade of the student based
on the score
     */
}
