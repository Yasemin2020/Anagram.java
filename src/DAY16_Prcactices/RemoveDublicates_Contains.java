package DAY16_Prcactices;

public class RemoveDublicates_Contains {
    public static void main(String[] args) {
        String str ="aabbbabc";
        String result="";
        for (int i = 0; i <=str.length()-1 ; i++) {
            String x="" +str.charAt(i);// char x=str.charAt(i); contains(burada string ister),
                                    // o yüzden x leri string yapıyoruz
            if (!result.contains(x)){
                result+=x;
            }
            }
        System.out.println(result);
        }
        /*
        Write a program that can remove the duplicated characters from a
String
Ex:
input:
AABBCCBC
Output:
ABC
Hint: You can add each characters of the
string into another String
  Condition: the character is not
contained in the other String yet before you are adding
         */
    }

