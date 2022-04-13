package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {

        String str="Java is fun, I love learning Java";
       String str2=str.replace("Java","Python");
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
        String email="JohnSmith@yahoo.com";
        email=email.replace("yahoo","gmail");
        System.out.println("email = " + email);

        String sentence="Java Java Python Python C# C# C++ C++ C++ Python Python Python Python ";
        String sentence2=sentence.replace("Python ","").replace("  "," ");

        System.out.println("sentence = " + sentence);
        System.out.println("sentence2 = " + sentence2);

        String s2="C# is fun, C# is cool";
        s2=s2.replace(" C#","Java");
        System.out.println("s2 = " + s2);
        System.out.println("-----------------------------------------------------------");
        String result="Java Java Java";
        result=result.replaceFirst("Java","python");
        System.out.println("result = " + result);

        String result2="C# is fun,C# is cool";
        result2=result2.replaceFirst("C#","Java");
        System.out.println("result2 = " + result2);






    }
}
