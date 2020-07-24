package Homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework6Ex2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String temp;
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("If you wont exit imput \" exit \" " +
                    "or imput you text :");
            temp = in.nextLine();
            if (temp.equalsIgnoreCase("exit")){
                break;
            }
            list.add(temp);
        }
        list.forEach(System.out::println);
    }
}
