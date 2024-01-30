package Module3.Library.Model;

import java.util.ArrayList;
import java.util.List;
public class LibraryMember {
    private String name;
    private int ID;
    private List<Book> borrowedBooks;

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

    public String toString() {
        return "LibraryMember: " + name + ", ID: " + ID;
    }


}
