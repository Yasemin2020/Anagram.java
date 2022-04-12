package DAY09_IfStatements;

public class Vote {
    public static void main(String[] args) {
      String name="Allan";
      String citizen="USA";
      int age=32;
      if (citizen=="USA"&&age>=18){
          System.out.println(name+" is eligible to vote");
      }else{
          System.out.println(name+" is not eligible to vote");
      }




    }
}
