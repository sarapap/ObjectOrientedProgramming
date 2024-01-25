package Module2.BookBorrowingSystem;


public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        Book1 Book1 = new Book1("Harry Potter and the Philosophers Stone", "J. K. Rowling", 2001);
        Book1 Book2 = new Book1("Iron Flame", "Rebecca Yarros", 2023);
        Book1 Book3 = new Book1("Icebreaker", "Hannah Grace", 2022);
        Book1 Book4 = new Book1("1984", "George Orwell", 1949);

        library.addBook(Book1);
        library.addBook(Book2);
        library.addBook(Book3);
        library.addBook(Book4);
        library.displayBooks();
        library.findBooksByAuthor("Hannah Grace");
        library.borrowBook("Iron Flame");
        library.updatedBooks();
    }
}
