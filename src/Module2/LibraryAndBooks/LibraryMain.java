package Module2.LibraryAndBooks;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        Book Book1 = new Book("Harry Potter and the Philosophers Stone", "J. K. Rowling", 2001);
        Book Book2 = new Book("Iron Flame", "Rebecca Yarros", 2023);
        Book Book3 = new Book("Icebreaker", "Hannah Grace", 2022);
        Book Book4 = new Book("1984", "George Orwell", 1949);

        library.addBook(Book1);
        library.addBook(Book2);
        library.addBook(Book3);
        library.addBook(Book4);
        library.displayBooks();
        library.findBooksByAuthor("Hannah Grace");
    }
}