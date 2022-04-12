package DAY21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {
      String[] name= {"Gunay Sert", "Suat Van", "Havva Van", "Ali Kara", "Mikael Light","Ayse San",};
      for(String each:name)  {
          String initial=each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1)+".";
          System.out.println(initial);
      }


    }
}
