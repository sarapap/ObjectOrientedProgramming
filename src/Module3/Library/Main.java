package Module3.Library;

import Module3.Library.System.Library;
import Module3.Library.Model.Book;
import Module3.Library.Model.LibraryMember;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book Book = new Book("Harry Potter", "J. K. Rowling", "978-0590353427");
        LibraryMember libraryMember = new LibraryMember("Sara", 1);


        library.addBook(Book);
        library.addMember(libraryMember);
        library.borrowBook(libraryMember, Book);
        library.returnBook(libraryMember, Book);


    }
}
