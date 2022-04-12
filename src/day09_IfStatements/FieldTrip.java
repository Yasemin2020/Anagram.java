package day09_IfStatements;

public class FieldTrip {
    public static void main(String[] args) {
       int grade=2, number=0;
       String location="", teacher="";
       if (grade>=1&&grade<=6) {
           if (grade == 1) {
               location = "Apple orchard";
               number = 3;
               teacher = "Ms. Smith";
           } else if (grade == 2) {
               location = "Zoo";
               number = 7;
               teacher = "Ms. Lee";
           } else if (grade == 3) {
               location = "Aquarium";
               number = 5;
               teacher = "Ms. Wilson";
           } else if (grade == 4) {
               location = "Movie theater";
               number = 2;
               teacher = "Ms. Reyes";
           } else if (grade == 5) {
               location = "Museum";
               number = 5;
               teacher = "Ms. Lela";
           } else if (grade == 6) {
               location = "Six Flags";
               number = 8;
               teacher = "Mr. Watt";
           }
           System.out.println("grade - " + grade);
           System.out.println("location - " + location);
           System.out.println("number of groups - " + number);
           System.out.println("teacher in charge - " + teacher);
       }else{
           System.out.println("invalid grade");
       }


    }
}
