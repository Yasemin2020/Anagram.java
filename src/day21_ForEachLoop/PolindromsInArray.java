package day21_ForEachLoop;

public class PolindromsInArray {
    public static void main(String[] args) {
        String[] polindrom={"anna", "level", "Java"};

        int count=0;




        for (String each : polindrom) {
            each=each.toLowerCase();
            String reverse="";

            for (int i = each.length()-1; i >=0 ; i--) {
              reverse+=each.charAt(i);

            }
            if(reverse.equals(each)){
                count++;
            }

        }
        System.out.println(count);



     /*   /public class Palindromes {
            public static void main(String[] args) {
                String[] str={"anna","level","madam","Java"};
                String[] reversed=new String[str.length];
                int count=0;
                for (String word : str) {
                    String reverse="";
                    for (int i = word.length()-1; i >=0 ; i--) {
                        reverse+=word.charAt(i);
                    }
                    if(word.equalsIgnoreCase(reverse))
                        count++;
                }
                System.out.println(count+ " words are palindrome");
            }
        }

public class D21_T04_Palindrom {
    public static void main(String[] args) {
        String[] arr = {"Anna", "level", "Java"};
        int count = 0;

        for (String s : arr) {
            String p = "";

            for (int i = s.length()-1; i >=0 ; i--) {
                p += s.charAt(i);
            }
            if (p.equalsIgnoreCase(s)){
                count++;
            }
        }
        System.out.println(count);
    }
}
         */
    }
}
