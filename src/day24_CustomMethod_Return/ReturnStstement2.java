package day24_CustomMethod_Return;

public class ReturnStstement2 {
    public static void main(String[] args) {
        months(13);
    }
    public static void months(int number){
        if (number<1||number>12) {
            System.out.println("Invalid");
            return;
        }
            String month = (number == 1) ? "Jenuary" : (number == 2) ? "February" : (number == 3) ? "March" :
                    (number == 4) ? "April" : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" :
                            (number == 8) ? "August" : (number == 9) ? "September" : (number == 10) ? "October" :
                                    (number == 11) ? "November" : "December";
            System.out.println(month);

    }
}
