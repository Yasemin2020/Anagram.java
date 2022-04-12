package DAY10_NastedIf;

public class Grade {
    public static void main(String[] args) {
        char grade='A';
        String total="";
        if(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F') {
            if (grade == 'A')
                total = grade + ":excellent";
            else if (grade == 'B')
                total = grade + ": Great Job";
            else if (grade == 'C')
                total = grade + ": Good";
            else if (grade == 'D')
                total = grade + ": Passed";
            else
                total = grade + ": Failed";
        }else{
            total="Invalid";}
        System.out.println(total);




      /*  Create a class called Grade, a char variable named grade is given.
        write a program to print the following messages:
        'A': excellent
        'B': great job
        'C': good
        'D': passed
        'F': failed
        other wise: invalid
        NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
                STATEMENT*/
    }
}
