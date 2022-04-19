package day42_Exceptions;

class FadyExceptions extends RuntimeException{
    public FadyExceptions(String message){
        super(message);
    }
}// custom unchecked exception

class NoBreakException extends Exception{// custom checked exception

}

public class CustomExceptions {
    public static void main(String[] args) {
       //throw new FadyExceptions("It's time for short break");

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }
    }

}
