package day20_Arrays;

public class ClassMates {
    public static void main(String[] args) {
        String[] names={"Ali Güven","Zeynep Aşkın","Selami Demir","Fatma Uysal","Memduh Şeker","Cerys Wonderful","Verina Cool","Mike Busy",
                "Jasmine Prof", "Harry Harrison"};
        for (String each : names) {
            System.out.println(each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1)+".");

        }


        /*
         create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
         */



    }
}
