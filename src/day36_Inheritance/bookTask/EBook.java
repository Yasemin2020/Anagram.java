package day36_Inheritance.bookTask;

public class EBook extends Book {
    public String size;
    public int pages;
    public void readBook(String name){
        System.out.println("reading "+ name);
    }

}
/*
3.2 Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size, pages

			Methods:
				setInfo()
				readBook()
				toString()
 */