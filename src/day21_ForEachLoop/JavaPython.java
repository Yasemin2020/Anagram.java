package day21_ForEachLoop;

public class JavaPython {
    public static void main(String[] args) {
        String[] str = {"Java", "Cydeo", "python", "Wooden Spoon", "Birds", "Java", "Python",
                "java", "Java", "Java"};
        int countJ=0;
        int countP=0;
        for(String each:str){
            each=each.toLowerCase();
            if(each.equals("java")){
                countJ++;
            }
            if(each.equals("python")){
              countP++;

            }
        }
        System.out.println("There are "+countJ+" Java and "+countP+" Python in the array");
        /*
        Write a program that can return the number of appearances of
âjavaâ and âpythonâ anywhere in the sentence.
(similar to the task 97 in repl.it, but
this time you MUST use arrays and for each loop)
         */
    }
}
