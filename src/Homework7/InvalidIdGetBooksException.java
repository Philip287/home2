package Homework7;

public class InvalidIdGetBooksException extends Exception {

    public InvalidIdGetBooksException() {
        super("The Book Shelf is Empty");
    }

}
