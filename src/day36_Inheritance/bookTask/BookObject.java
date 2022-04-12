package day36_Inheritance.bookTask;

public class BookObject {
    public static void main(String[] args) {

        EBook ebook1 = new EBook();

        ebook1.setInfo("The Little Prince", "Fairy Tale", "Antoine de Saint-ExupÃ©ry", 3);


        System.out.println(ebook1);
        ebook1.readBook("The Little Prince");

        System.out.println("===================================================================================");

        AudioBook audioBook1 = new AudioBook();

        audioBook1.setInfo("Atomic Habits", "Self-Help", "James Clear", 23.99);


        System.out.println(audioBook1);
        audioBook1.listen("Atomic Habits");


    }
}
