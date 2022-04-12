package DAY14_String;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1="  batch   25  ";
        str1=str1.trim();
        System.out.println(str1);

        String str2="Cydeo School";
        int n1=str2.indexOf("h");
        System.out.println("n1 = " + n1);//8

       int n2= str2.indexOf("o");//first "o"
        System.out.println("n2 = " + n2);//4




        int n3=str2.indexOf("ool");
        System.out.println("n3 = " + n3);//9

        String str3="Java Programming Language";
        int n4=str3.indexOf("an");
        System.out.println("n4 = " + n4);

        int n5=str3.indexOf("gua");
        System.out.println("n5 = " + n5);

        int n6=str3.lastIndexOf("g");
        System.out.println("n6 = " + n6);

        String s="Java Nova Cava Wawa orange";
        int firstA=s.indexOf("a");
        int lastA=s.lastIndexOf("a");
        int secondA=s.indexOf("a ");//second a
        int thirdA=s.indexOf("a C");
        int forthA=s.lastIndexOf("av");
        int fifthA=s.lastIndexOf("va")+1;
        int sixthA=s.lastIndexOf("aw");
       // int seventhA=s.indexOf("a o");
        int seventhA=s.lastIndexOf("a ");


        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("forthA = " + forthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);





    }
}
