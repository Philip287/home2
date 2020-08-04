package Homework7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Homework7.Category.History;
import static Homework7.Category.Philosophy;
import static Homework7.Category.Science;

public class Exeption {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        BookShelf first = new BookShelf(Philosophy, 2, 1, new ArrayList<Book>());
        BookShelf second = new BookShelf(History, 2, 2, new ArrayList<Book>());
        BookShelf third = new BookShelf(Science, 2, 3, new ArrayList<Book>());

        Book book1 = new Book("1984", 1, Philosophy);
        System.out.println(book1.toString());
        Book book2 = new Book("History of Belarus", 2, History);
        System.out.println(book2.toString());
        Book book3 = new Book("History of Russian", 3, History);
        System.out.println(book3.toString());
        Book book4 = new Book("History of Poland", 4, History);
        System.out.println(book4.toString());
        Book book5 = new Book();

        try {
            book5.newBook(scanner);
        } catch (InvalidBookException e) {
            System.out.println(e);

        }
        System.out.println(book3.toString());
        try {
            first.placement(book1);
        } catch (InvalidPlacementException e) {
            System.out.println(e);
        }
        try {
            first.placement(book2);
        } catch (InvalidPlacementException e) {
            System.out.println(e);
        }
        try {
            first.placement(book3);
        } catch (InvalidPlacementException e) {
            System.out.println(e);
        }
        try {
            second.placement(book2);
        } catch (InvalidPlacementException e) {
            System.out.println(e);
        }
        try {
            second.placement(book3);
        } catch (InvalidPlacementException e) {
            System.out.println(e);
        }
        try {
            second.placement(book4);
        } catch (InvalidPlacementException e) {
            System.out.println(e);
        }
        try {
            System.out.println(second.getBook().toString());
        } catch (InvalidIdGetBooksException e) {

            System.out.println(e);
        }
        try {
            System.out.println(third.getBook().toString());
        } catch (InvalidIdGetBooksException e) {

            System.out.println(e);
        }

    }

}