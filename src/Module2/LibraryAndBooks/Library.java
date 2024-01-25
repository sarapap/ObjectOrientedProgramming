package Module2.LibraryAndBooks;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add methods here

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("\nThe Book Selection: ");
        for (Book book : books) {
            System.out.println("\n- Title: " + book.getTitle());
            System.out.println("- Author: " + book.getAuthor());
            System.out.println("- Publication year: " + book.getYear());
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("\nBooks by the author " + author + ": ");
        boolean found= false;

        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                found = true;
                System.out.println("- " + book.getTitle() + ", " + book.getYear());
            }
        }
        if (!found) {
            System.out.println("No books by the author. ");
        }

    }

    }
