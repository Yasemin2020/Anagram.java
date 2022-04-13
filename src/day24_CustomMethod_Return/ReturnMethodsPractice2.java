package day24_CustomMethod_Return;

public class ReturnMethodsPractice2 {
    public static void main(String[] args) {
        String str1=grade(95);


        switch(str1){
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Great Job");
                break;
            case "C":
                System.out.println("Good");
                break;
            case "D":
                System.out.println("Passed");
                break;
            case "F":
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");

        }

        //crate a function that can calculate grade
    }
    public static String grade(int score){
        String result="";
        if (score<0||score>100){
            result="Invalid";


        }else {
            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
            System.out.println(result);
        }
        return result;
    }

}
