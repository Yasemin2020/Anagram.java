package day35_Encapsulation.day34_GarbageCollection_AccessModifiers;

public class Constroctor_Vs_StaticBlock {

    static{
        System.out.println("Static Block");
    }
    public Constroctor_Vs_StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Constroctor_Vs_StaticBlock();
        new Constroctor_Vs_StaticBlock();
        new Constroctor_Vs_StaticBlock();
        new Constroctor_Vs_StaticBlock();
        System.out.println("Main Block");
        new Constroctor_Vs_StaticBlock();

    }


}
