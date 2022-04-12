package DAY10_NastedIf;

public class MonthsTernaries {
    public static void main(String[] args) {
        int n=12;
        String month=(n==1)?"Jenuary":(n==2)?"February":(n==3)?"March":(n==4)?"April":(n==5)?"May":(n==6)?"June":
                (n==7)?"July":(n==8)?"August":(n==9)?"September":(n==10)?"October":
                        (n==11)?"November":"December";
        System.out.println("month = " + month);

    }
}
