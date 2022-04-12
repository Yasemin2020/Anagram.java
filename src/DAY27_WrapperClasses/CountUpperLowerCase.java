package DAY27_WrapperClasses;

public class CountUpperLowerCase {
    public static void main(String[] args) {
        boolean isEqual;
        String str="JAVA java";
        char[] ch=str.toCharArray();
        int upperCase=0;
        int lowerCase=0;
        for (char each : ch) {
            if (Character.isUpperCase(each)){
                upperCase++;
            }else if(Character.isLowerCase(each)){
                lowerCase++;
            }

        }
        isEqual=upperCase==lowerCase;
        System.out.println(isEqual);

        /*
        Write program that returns true if the total number of upper case
characters are equal to total number of Lowercase characters of a
string
Ex:
str = "JAVA java";
output:
true
         */


    }
}
