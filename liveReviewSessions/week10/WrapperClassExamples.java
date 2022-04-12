package week10;

public class WrapperClassExamples {
    public static void main(String[] args) {
        int i1=100;
        Integer i2=i1;// auto boxing- implicitly

        Integer n1=300;
        int n2=n1;// unboxing: from object to primitive- implicitly

        String str="123";
        System.out.println(str+1);

        int num=Integer.parseInt(str);
        System.out.println(num+1);

        String price="$27.16";
        price=price.substring(1);
        double priceInDouble=Double.parseDouble(price);//turn to primitive
        Double priceInWrapDouble=Double.valueOf(price);

        System.out.println(priceInDouble+10);

        //Difference between Integer.parseInt(str) and Integer.valueOf(str)
            Integer num2 = Integer.valueOf(str);
        System.out.println(num2+1);//124

        char ch='1';

        boolean isDigit=Character.isDigit(ch);
        System.out.println("isDigit = " + isDigit);

        boolean isLetter=Character.isLetter(ch);
        System.out.println("isLetter = " + isLetter);

        String strTwo="a1b2c3";

        //sum of the integers inside strTwo

        int sumOfDigits=0;

        for(char each:strTwo.toCharArray()){
            if (Character.isDigit(each)){
                sumOfDigits+=Integer.parseInt(each+"");
            }
        }
        System.out.println("sumOfDigits = " + sumOfDigits);

        String strThree = "abcd1234!@#$efghi6789#$%^ABCD";

        String letters="";
        String uppercaseLetters="";
        String lowercaseLetters="";
        String digits="";
        String specialChars="";

        for(char each : strThree.toCharArray()){
            if (Character.isLetter(each)){
                if (Character.isUpperCase(each)){
                    uppercaseLetters+=each;
                }else{
                    lowercaseLetters+=each;
                }
            }else if(Character.isDigit(each)){
                digits+=each;
            }else{
                specialChars+=each;
            }

        }







    }
}
