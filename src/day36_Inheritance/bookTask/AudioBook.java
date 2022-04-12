package day36_Inheritance.bookTask;

public class AudioBook extends Book {
    public double length;
    public String narrator;

    public void listen(String bookTitle){
        System.out.println("listenning "+bookTitle);
    }


}
/*
3.3 Create a sub class of Book named AudioBook:
			variables:
				title, type, author, price, length, narrator

			Methods:
				setInfo()
				listen()
				toString()

 */