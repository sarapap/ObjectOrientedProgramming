package Module2.BookBorrowingSystem;

import Module2.LibraryAndBooks.Book;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book1> books = new ArrayList<>();

    // Add methods here

    public void addBook(Book1 book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("\nThe Book Selection: ");
        for (Book1 book : books) {
            System.out.println("\n- Title: " + book.getTitle());
            System.out.println("- Author: " + book.getAuthor());
            System.out.println("- Publication year: " + book.getYear());
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("\nBooks by the author " + author + ": ");
        boolean found= false;

        for (Book1 book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                found = true;
                System.out.println("- " + book.getTitle() + ", " + book.getYear());
            }
        }
        if (!found) {
            System.out.println("No books by the author. ");
        }

    }

    public void borrowBook(String title) {
        System.out.println("\nThis book is being borrowed. ");
        boolean borrowed = false;

        for (Book1 book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                borrowed = true;
                books.remove(title);
                System.out.println("- " + book.getTitle() + ", " + book.getYear());
            }
        }
        if (!borrowed) {
            System.out.println("\nThis book is available.");
        }
    }

    public void returnBook(Book book) {

    }

    public void updatedBooks() {
        System.out.println("\nUpdated Book Selection: ");
        for (Book1 book : books) {
            System.out.println("\n- Title: " + book.getTitle());
            System.out.println("- Author: " + book.getAuthor());
            System.out.println("- Publication year: " + book.getYear());
        }
    }

}
