package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        //assignment
        int number=100;
        System.out.println("number = " + number);//100
        number=200;
        System.out.println("number = " + number);//200

        String word="Java Programming";
        System.out.println("word = " + word);// Java Programming
        word="Wooden Spoon";
        System.out.println("word = " + word);//Wooden Spoon
        word="Cydeo";
        System.out.println("word = " + word);//Cydeo
        System.out.println("-----------------------");
        //addition assignment
        int x=100;
        System.out.println("x = " + x);//100
        System.out.println(x+200);//300
        //x=x+200
        x+=200;
        System.out.println("x="+x);


        String str="Wooden";
        str+="Spoon";
        System.out.println("str = " + str);//WoodenSpoon

        double num1=2.5;
        System.out.println("num1 = " + num1);//2.5
        num1+=5.5;
        System.out.println("num1 = " + num1);//8

        double availableBalance=1000.50;
        //deposit 300$ para yatırmak
        availableBalance+=300;//1300.5
        System.out.println("availableBalance = " + availableBalance);
       //withdrawing 500$ para çekme
        availableBalance-=500;//800.5
        System.out.println("availableBalance = " + availableBalance);//800
        //withdrawing 200$, than depositing 400$
        availableBalance-=200;//600.5
        System.out.println("availableBalance = " + availableBalance);
        availableBalance+=400;//1000.5
        System.out.println("availableBalance = " + availableBalance);
        System.out.println("----------------------------");
        double salary=50000.5;

        salary*=2;
        System.out.println("salary = " + salary);
        salary+=salary;
        System.out.println("salary = " + salary);

        double doge=0.00000001;
        doge*=1000000;
        System.out.println("doge = " + doge);
        System.out.println();
        //num2=num2/2
        double num2=25000.0;
        num2/=2;
        System.out.println("num2 = " + num2);
        System.out.println("-----------------------");
        double num3=100;
        //%=
        num3%=3;
        System.out.println("num3 = " + num3);

        int amount=127;//cents
        int quarters=127/25;
        int cents=127%25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
        
        int cents2=127;
        cents2%=25;
        System.out.println("cents2 = " + cents2);
        int y=300;
        System.out.println("(y%=16) = " + (y%=16));//12


        int balance=3500;
        //insurence fee:$153
        balance%=153;
        System.out.println("balance = " + balance);
        
        System.out.println("---------------------");

        










    }
}
