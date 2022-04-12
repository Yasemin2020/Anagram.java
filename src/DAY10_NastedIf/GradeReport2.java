package DAY10_NastedIf;

public class GradeReport2 {
    public static void main(String[] args) {
        int grade=100;
        String result=(grade>=0&&grade<=100)?(grade>=90)?"Exellant":(grade<=89&&grade>=80)?"Great":
                (grade<=79&&grade>=70)?"Good":(grade<=69&&grade>=60)?"Passed":"Failed":"invalid Score";

        System.out.println("result = " + result);
    }
}
