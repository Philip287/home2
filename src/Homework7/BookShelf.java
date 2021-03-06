package Homework7;

import java.util.ArrayList;

public class BookShelf {

    private Category category;
    private int numberOfBook;
    private int IdShelf;
    ArrayList<Book> Books;

    public BookShelf(Category category, int numberOfBook, int idShelf, ArrayList<Book> books) {
        this.category = category;
        this.numberOfBook = numberOfBook;
        IdShelf = idShelf;
        Books = books;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getNumberOfBook() {
        return numberOfBook;
    }

    public void setNumberOfBook(int numberOfBook) {
        this.numberOfBook = numberOfBook;
    }

    public int getIdShelf() {
        return IdShelf;
    }

    public void setIdShelf(int idShelf) {
        IdShelf = idShelf;
    }

    public ArrayList<Book> getBooks() {
        return Books;
    }

    public void setBooks(ArrayList<Book> books) {
        Books = books;
    }

    @Override
    public String toString() {
        return "BookShelf" +
                "category=" + category +
                ", numberOfBook=" + numberOfBook +
                ", IdShelf=" + IdShelf +
                ", Books=" + Books;
    }

    public void placement(Book book) throws InvalidPlacementException {

        if (Books.size() == numberOfBook) {
            throw new InvalidPlacementException("Size is full");
        } else if (category != book.getCategory()) {
            throw new InvalidPlacementException("Invalid parametrs");
        } else {
            Books.add(book);
        }

    }

    public Book getBook() throws InvalidIdGetBooksException {
        if (Books.size() == 0) {
            throw new InvalidIdGetBooksException();
        } else {
            return Books.remove(Books.size() - 1);
        }
    }
}

