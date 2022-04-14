package day40_FinalKeyword;

public class FinalVariable {
    final String birthday;
    final static String name;
    static{
        name="EU8";
    }

    public FinalVariable(String birthday) {
        this.birthday = birthday;
    }


    public static void main(String[] args) {
        final double pi=3.14;
       // pi=4.14; // final variables can not be reassigned ----> compile error

        final String name;
        name="Java";
       // name="Wooden Spoon";// compile error
        System.out.println(name);

        FinalVariable obj= new FinalVariable("May/01");
        //obj.birthday="June/01";//you can only assign final once
        FinalVariable obj2=new FinalVariable("April/12");
        System.out.println(obj.birthday);

        System.out.println("------------------------------------");

        System.out.println(name);

        System.out.println("------------------------------------");

        //FinalVariable.name="Python";
        System.out.println(FinalVariable.name);


    }
}
