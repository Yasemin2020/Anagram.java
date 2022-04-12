package DAY09_IfStatements;

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch='A';
        if (ch>=1&&ch<=255)
            if(ch>=65&&ch<=90||ch>=97&&ch<=122)
        System.out.println(ch+" Alphabetic Character");
        else if (ch>=48&&ch<=57)
                System.out.println(ch+" Digit");
        else
                System.out.println(ch+" Special Character");


        /*
        Create a class called Character Identity, and write a program that can
identify if the given character is a digit or Alphabetic Character(A~Z
or a~Z) or a special character
Ex:
ch = '@'
output:
Special Character
HINT: You may wanna check out the numbers of the
chracters on ASCII table
         */
    }
}
