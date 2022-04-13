package day24_CustomMethod_Return;

public class Return_vs_ExitMethod {
    public static void main(String[]args){
months(50);
        System.out.println("Hello World");
}
    public static void months(int number){
        if (number<1||number>12) {
            System.out.println("Invalid");
            //return;exits nameOfMonth method, remaining code fragments of the method never get executed.
            System.exit(0);
        }
        String month = (number == 1) ? "Jenuary" : (number == 2) ? "February" : (number == 3) ? "March" :
                (number == 4) ? "April" : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" :
                        (number == 8) ? "August" : (number == 9) ? "September" : (number == 10) ? "October" :
                                (number == 11) ? "November" : "December";
        System.out.println(month);

    }
}
