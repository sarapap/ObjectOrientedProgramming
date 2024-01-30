package Module3.Library2;

import Module3.Library2.System.Library;
import Module3.Library2.Model.Book;
import Module3.Library2.Model.LibraryMember;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book Book = new Book("Harry Potter", "J. K. Rowling", "978-0590353427");
        Book Book2 = new Book("jjj", "kkk", "sss");
        LibraryMember libraryMember = new LibraryMember("Sara", 1);



        library.addBook(Book);
        library.addMember(libraryMember);
        library.borrowBook(libraryMember, Book);
        library.returnBook(libraryMember, Book);


        library.addMember(libraryMember);
        library.reserveBook(libraryMember, Book);
        library.reserveBook(libraryMember, Book2);
        library.cancelReservation(libraryMember, Book);
        library.displayReservedBooks(libraryMember);


    }
}
