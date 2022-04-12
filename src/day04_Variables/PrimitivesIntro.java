package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
        //age 38 years old
        byte age=38;
        //weight:160 pounds
        //byte weight=160; 160 is out of byte range -128<byte<127
        short weight= 160; //chose variable names meaningful -32768<short<32767
        int salary=120000; //-2,147,483,648<int<2,147,483,647 int is preferred data type for integer numbers
        long price=10_000_000_000l;//-9,223,372,036,854,775,808---19 digits; l hss a warning. Ignore it
        long asset= 3_333_333_333L;//if you dont write L/l compiler will read it as an integer by default
        float tax=0.26F;//compiler read decimals as double. So write F/f at the end of number
        double peach=2.36;


        //#
        char ch1='#';
        System.out.println("ch1 = " + ch1);

        char ch2=35;
        System.out.println("ch2 = " + ch2);

        char ch3=2563;
        System.out.println("ch3 = " + ch3);

        char gender='F';
        char grade='F';
        char yesNo='Y';
        System.out.println("yesNo = " + yesNo);
        System.out.println("grade = " + grade);
        System.out.println("gender = " + gender);

        boolean isEmployeed=true;
        boolean isMarried=false;
        boolean result=122<165;
        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("result = " + result);

        String name="wooden spoon";
        String city="Mclean";
        String state="Virginia";
        String country="USA";
        System.out.println("name= "+name);


    }





}
