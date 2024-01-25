package Module2.LibraryUser;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    // Add methods here

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void displayBooks() {
        System.out.println("\nThe Book Selection: ");
        for (Book book : books) {
            System.out.println("\n- Title: " + book.getTitle());
            System.out.println("- Author: " + book.getAuthor());
            System.out.println("- Publication year: " + book.getYear());
        }
    }

    public void displayUsers() {
        System.out.println("\nUsers in the library with borrowed books: ");
        for (User user : users) {
            System.out.println("\nName: " + user.getName() + " with the age of " + user.getAge());
            List<Book> borrowedBooks = user.getList();
            if (!borrowedBooks.isEmpty()) {
                for (Book book : user.getList()) {
                    System.out.println("Borrowed books: " + book.getTitle());
                }
            } else {
                System.out.println("No borrowed books.");
            }
            System.out.println();
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

    public void borrowBook(String title) {
        System.out.println("\nThis book is being borrowed: ");

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                System.out.println("- " + book.getTitle() + ", " + book.getYear());
                return;
            }
        }
    }

    public void returnBook(Book book) {
        System.out.println("\nThis book has been returned: ");
        books.add(book);
        System.out.println("- " + book.getTitle() + ", " + book.getYear());
    }

    public void updatedBooks() {
        System.out.println("\nUpdated Book Selection: ");
        for (Book book : books) {
            System.out.println("\n- Title: " + book.getTitle());
            System.out.println("- Author: " + book.getAuthor());
            System.out.println("- Publication year: " + book.getYear());
        }
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        } return false;
    }

    public double getAverageBookRating() {
        double average = 0;
        for (Book book :  books) {
            average += book.getRating();
        } return average / books.size();
    }

    public Book getMostReviewedBook() {
        Book mostReviewedBook = books.get(0);
        for (Book book : books) {
            if (book.getReviewCount() > mostReviewedBook.getReviewCount()) {
                mostReviewedBook = book;
            }
        }
        return mostReviewedBook;
    }

}
