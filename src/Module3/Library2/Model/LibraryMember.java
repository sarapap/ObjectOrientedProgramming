package Module3.Library2.Model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private int ID;
    private List<Book> borrowedBooks;
    private List<Book> reservedBooks = new ArrayList<>();

    public LibraryMember(String name, int ID) {
        this.name = name;
        this.ID = ID;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(name + " borrowed the book: " + book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        System.out.println(name + " returned the book: " + book);
    }


    // Existing methods: getters, setters
    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }

    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }

    public List<Book> getReservedBooks() {
        return reservedBooks;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "LibraryMember: " + name + ", ID: " + ID;
    }



}
