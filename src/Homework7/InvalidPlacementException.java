package Homework7;

import java.util.Scanner;

public class InvalidPlacementException extends Exception{
    public InvalidPlacementException(String s) {
        super("The Book can not add at shelf." + s);
    }
}
