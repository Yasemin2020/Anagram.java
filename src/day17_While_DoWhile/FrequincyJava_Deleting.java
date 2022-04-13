package day17_While_DoWhile;

public class FrequincyJava_Deleting {
    public static void main(String[] args) {
        /*Scanner scan=new Scanner(System.in);//I love Java. Java is Java not so tough
        System.out.println("Enter a sentece:");
        String str= scan.nextLine();*/
        String str="JavaJavaJava JAva";
        int frequency=0;
        str=str.toLowerCase();

            while(str.contains("java")){
            str=str.replaceFirst("java","");
            frequency++;
        }
        System.out.println(frequency);

        System.out.println("------------------------------");
        String sentence="cat cat cat dog dog";
        int countCat=0;
        int countDog=0;
        while (sentence.contains("cat")){
            sentence=sentence.replaceFirst("cat","");
            countCat++;
        }
        while (sentence.contains("dog")) {
            sentence=sentence.replaceFirst("dog","");
            countDog++;

        }
        System.out.println("countCat = " + countCat);
        System.out.println("countDog = " + countDog);
        System.out.println("----------------------------------");
        String s="Java Java Java Phython Phyton";
        int countJava=0;
        int countPhyton=0;
        while(s.contains("Java")||s.contains("Phyton")){
           if(s.contains("Java")) {
               s = s.replaceFirst("Java", "");
               countJava++;
           }
           if(s.contains("Phyton")){
               s=s.replaceFirst("Phyton","");
               countPhyton++;
           }


        }

        System.out.println("countJava = " + countJava);
        System.out.println("countPhyton = " + countPhyton);

    }
}
