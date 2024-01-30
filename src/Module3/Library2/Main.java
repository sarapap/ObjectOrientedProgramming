package Module3.Library2;

import Module3.Library2.System.Library;
import Module3.Library2.Model.Book;
import Module3.Library2.Model.LibraryMember;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book Book = new Book("Harry Potter", "J. K. Rowling", "sss");
        LibraryMember libraryMember = new LibraryMember("Sara", 1);


        /*library.addBook(Book);
        library.addMember(libraryMember);
        library.borrowBooks(libraryMember, Book);
        library.returnBooks(libraryMember, Book);
        library.displayBooks();
        library.displayMembers();*/

        library.addMember(libraryMember);
        library.reserveBook(libraryMember, Book);
        library.cancelReservation(libraryMember, Book);
        library.displayReservedBooks(libraryMember);


    }
}
