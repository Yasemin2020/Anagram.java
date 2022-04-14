package day39_Recap.animalTask;



public class Zoo {
    public static void main(String[] args) {
        Tiger tiger=new Tiger("Tig", "Tiggy", 'F',5,"Big","Brown",
            true,false,false);
        tiger.eat();
        tiger.fur();
        System.out.println(tiger);
        Cat cat= new Cat("Catty", "Kitty",'M',4,"small","white",
                false,true,true);
        cat.meow();
        cat.setName("Smoke");
        System.out.println(cat);



    }

}
