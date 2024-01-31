package Module3.Library2;

import Module3.Library2.System.Library;
import Module3.Library2.Model.Book;
import Module3.Library2.Model.LibraryMember;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book Book = new Book("Harry Potter", "J. K. Rowling", "978-0590353427");
        Book Book2 = new Book("Iron Flame", "Rebecca Yarros", "979-0590353427");
        Book Book3 = new Book("Icebreaker", "Hannah Grace", "980-0590353427");
        Book Book4 = new Book("1984", "George Orwell", "979-0590353427" );
        LibraryMember libraryMember = new LibraryMember("Sara", 1);
        LibraryMember libraryMember2 = new LibraryMember("Heidi", 2);



        library.addBook(Book);
        library.addBook(Book2);
        library.addBook(Book3);
        library.addBook(Book4);
        library.addMember(libraryMember);
        library.addMember(libraryMember2);


        library.reserveBook(libraryMember, Book);
        library.reserveBook(libraryMember, Book2);
        library.reserveBook(libraryMember2, Book3);
        library.reserveBook(libraryMember2, Book4);
        library.cancelReservation(libraryMember, Book);
        library.displayReservedBooks(libraryMember);
        library.displayReservedBooks(libraryMember2);


    }
}
