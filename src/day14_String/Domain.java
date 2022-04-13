package day14_String;

public class Domain {
    public static void main(String[] args) {

        String email="cydeo.school@gmail.com";
        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain = " + domain);
        System.out.println("------------------------------------");
        String str1="Java is fun, Java is cool, I love Java";
        String s1=str1.substring(0,10+1);      //Java is fun

        int beg=str1.indexOf(" J")+1;
        int end=str1.lastIndexOf(",") ;
        String s2=str1.substring(beg,end );//      Java is cool

        String s3=str1.substring(str1.lastIndexOf("I"));

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);


    }
}
