package Homework7;

public class InvalidIdBookException extends Exception {
    public InvalidIdBookException() {
        super("Invalid Id Book");
    }

    public InvalidIdBookException(String name) {
        super("Invalid Id Book: " + name);
    }

}
