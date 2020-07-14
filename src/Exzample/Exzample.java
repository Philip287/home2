package Exzample;

public class Exzample {
    public static void main(String[] args) {
        printMessege("Philip");
        printMessege("Suprun");
        printMessege("Nikolaevich");

        int a = 5;
        int b = 10;
        int rectanglSquare = calcRectangleSquare(a, b);
        int square = calcSquare(b);
        System.out.println("Rectangle square =" + square);
        System.out.println("Rectangle square =" + rectanglSquare);
    }

    static void printMessege(String name) {
        System.out.println("Hello " + name + "!!");

    }

    static int calcRectangleSquare(int x, int y) {
        int square = x * y;
        return square;
    }

    static int calcSquare(int x) {
        return x * x;
    }
}
