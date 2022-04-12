package Utilities;

import DAY34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test2 {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);

        //System.out.println(AccessModifiers.defaultData);//isn't in the same package default is not visible outside the package


        //System.out.println(AccessModifiers.privateData);//default is not visible outside the class

        AccessModifiers.method1();
        // AccessModifiers.method2();// compile error
        // AccessModifiers.method3();// compile error


    }
}
class D{
    public static void main(String[] args) {
        System.out.println("D");
    }
}