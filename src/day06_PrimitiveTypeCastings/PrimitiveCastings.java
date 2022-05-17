package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {
        byte a=100;
        short b=a;//short b=short a
        int c=b;//implicit casting
        //int c=(int)b
        long d=c;
        float e=d;
        double f=e;
        System.out.println("\n\n\n---------------------------");
        int x=55;
        short y=(short)x;//explicit casting
        System.out.println(x+":"+y);

        long j=1000000;
        short k=(short)j;
        System.out.println(j+":"+k);

        double l=2.5;
        float m=(float)l;
        System.out.println(l+":"+m);

        double n=10.8;
        int s=(int)n;//int s=(int)(long)n;(iki iş yapma. Doğrudan int e dönüştür.
        System.out.println(n+":"+s);
        System.out.println("---------------------------");
        double d1=20.5;
        short s1= (short) d1;//sadece d1 yazıp düzeltmeyi kullanabilirsin
        System.out.println(d1+":"+s1);


    }
}