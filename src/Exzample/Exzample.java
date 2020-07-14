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

        String str1 = "I like black coffe";
        String srt3 = "I like coffe !!!";
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        String str2 = "I like coffe";
        String str4 = new String("I like coffe");
        String substring = srt3.substring(0, 13);
        System.out.println("Substring =" + substring);
        boolean c = str2.equals(substring);
        System.out.println(c);
        boolean like = str1.startsWith( " I like ",1);
        boolean like2 = str1.endsWith("Free");
        System.out.println(like);
        System.out.println(like2);

        System.out.println(str1.replace("black","While"));
        System.out.println(srt3.indexOf("!!!"));
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
