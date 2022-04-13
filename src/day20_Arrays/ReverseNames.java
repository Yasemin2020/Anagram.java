package day20_Arrays;

public class ReverseNames {
    public static void main(String[] args) {
        String[] names={"Ali Güven","Zeynep Aşkın","Selami Demir","Fatma Uysal","Memduh Şeker","Cerys Wonderful","Verina Cool","Mike Busy",
                "Jasmine Prof", "Harry Harrison"};
        for(String each:names) {
            String reverse="";
            for (int i = each.length()-1; i >=0; i--) {
                reverse+=each.charAt(i);
            }
            System.out.println(reverse);
        }

    }
}
