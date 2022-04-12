package DAY28_ArrayList;

public class PasswordValidation {
    public static void main(String[] args) {
        /*
        PasswordValidation:
Write a program that can verify if a password is a strong password.
Characteristics of strong passwords are:
1. Password MUST be at least have 8 characters long, and
should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lower case letter
4. Password should at least contain one special
characters
5. Password should at least contain a digit
         */
        String password="aakojfht21/";

        boolean r1=password.length()>=8 && !password.contains(" ");
        boolean r2=false;//has Uppercase letters
        boolean r3=false;//has lower case letters
        boolean r4=false;//has special character
        boolean r5=false;//has digit

        char[] chars=password.toCharArray();

        for (char each : chars) {
            if (Character.isUpperCase(each)){
                r2=true;
            }else if(Character.isLowerCase(each)){
                r2=true;
            }else if (Character.isDigit(each)){
               r5=true;
            }else{
                r4=true;
            }
            if(r2 && r3 && r4 && r5){
                break;

            }

        }
        boolean isStrongPassword=r1 && r2 && r3 && r4 && r5;
        System.out.println("isStrongPassword = " + isStrongPassword);

    }
}
