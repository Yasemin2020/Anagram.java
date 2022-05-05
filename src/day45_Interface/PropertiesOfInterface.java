package day45_Interface;

public interface PropertiesOfInterface {
    int a=200;//by default static and final
    static int b=100;//dont need to write static

   /* public PropertiesOfInterface(int a){
        this.a=a;//constructor
    }*/
    /*static{
        b=100;//block
    }*/
    /*public void method1(){
        System.out.println("Instance method");//instance method
    }*/

    public static void method2(){
        System.out.println("Static method");
    }

    void method3();//public and abstract by default

    default void method4(){
        System.out.println("Default method");// it is used if the child classes all have the same implementation
    }
    class Test implements PropertiesOfInterface{

        @Override
        public void method3() {

        }

        public static void main(String[] args) {
            new Test().method4();
        }

    }

}
