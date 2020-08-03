package Homework7;

import java.util.Scanner;

import static Homework7.Category.History;
import static Homework7.Category.Philosophy;

public class Book {
    private String NameBook;
    private int IdBook;
    private Category category;
    private Category Science;

    public Book(String nameBook, int idBook, Category category) {
        NameBook = nameBook;
        IdBook = idBook;
        this.category = category;
    }

    public Book() {
    }

    public String getNameBook() {
        return NameBook;
    }

    public void setNameBook(String nameBook) {
        NameBook = nameBook;
    }

    public int getIdBook() {
        return IdBook;
    }

    public void setIdBook(int idBook) {
        IdBook = idBook;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book" +
                "NameBook='" + NameBook +
                ", IdBook=" + IdBook +
                ", category=" + category
                ;
    }

    public void newBook(Scanner scanner) throws InvalidIdBookException {
        System.out.print("Enter your NameBook: ");
        NameBook = scanner.nextLine();


        System.out.print("Enter your Id Book: ");
        try {
            IdBook = scanner.nextInt();
        } catch (Exception e) {
        throw new InvalidIdBookException();
        e.printStackTrace();
    }
        System.out.println("Enter your category book: ");
        String nameFromUser = scanner.next();
        switch (nameFromUser) {
            case "Philosophy":
                category = Philosophy;
            case "Science":
                category = Science;
            case "History":
                category = History;
            default: {
                throw new InvalidGetIdException();
                e.printStackTrace();
        }

    }
}
