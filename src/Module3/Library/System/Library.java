package Module3.Library.System;

import Module3.Library.Model.Book;
import Module3.Library.Model.LibraryMember;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void borrowBooks(LibraryMember member, Book book) {
        member.borrowBook(book);
    }

    public void returnBooks(LibraryMember member, Book book) {
        member.returnBook(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("\nBooks in the library: " + book);
        }
    }

    public void displayMembers() {
        System.out.println("\nMembers in the library: ");
        for (LibraryMember member : members) {
            System.out.println(member);
        }
    }


}
