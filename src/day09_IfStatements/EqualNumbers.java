package day09_IfStatements;

public class EqualNumbers {
    public static void main(String[] args) {
        int n1=19, n2=15, n3=19;
        String a;
        if (n1==n2&&n2==n3)
            a="all equal";
        else if(n1==n2&&n1!=n3)
            a=n1+"&"+n2+" are equal";
        else if(n1==n3&&n1!=n2)
            a=n1+"&"+n3+" are equal";
        else if(n3==n2&&n2!=n1)
            a=n2+"&"+n3+" are equal";
        else
            a="none of them are equal";
        System.out.println(a);


        /*
        reate a class called EqualNumbers, and write a program that can check
the equality of the three given numberrs
 declare 3 numbers n1, n2, n3
 if all are equal ==> print "all equal"
  if only n1 and n2 are equal
=>print  "n1&n2 are equal"
   if only n2 and n3 are equal
==>print "n2&n3 are equal"
   if only n3 and n1 are qual
==>print "n3&n1 are equal"
if none of them are euqal ==> none of
them are equal
         */
    }
}
