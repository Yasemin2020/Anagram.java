package day15_For_Loop;

public class StringMethods {
    public static void main(String[] args) {


    String str="  ";
    boolean r=str.isEmpty();

    System.out.println(r);

    boolean r1=str.isBlank();
        System.out.println(r1);

   String s1="CYDEO";
   String s2="cydeo";
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

  String sentence="My favorite programming language is Java";
  boolean hasCSharp=sentence.contains("C#");
  boolean hasJava=sentence.contains("Java");

  boolean hasJava2=sentence.toLowerCase().contains("java");

        System.out.println("hasCSharp = " + hasCSharp);
        System.out.println("hasJava = " + hasJava);
        System.out.println("hasJava2 = " + hasJava2);

        System.out.println("--------------------------");
        String a="Wooden Spoon";
        boolean x=a.startsWith("Woo");
        boolean y=a.endsWith("Spoon");
        boolean z=a.toLowerCase().startsWith("w");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);





}}
