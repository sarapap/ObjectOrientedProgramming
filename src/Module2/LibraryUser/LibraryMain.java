package Module2.LibraryUser;


public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        Book Book = new Book("Harry Potter and the Philosophers Stone", "J. K. Rowling", 2001);
        Book Book2 = new Book("Iron Flame", "Rebecca Yarros", 2023);
        Book Book3 = new Book("Icebreaker", "Hannah Grace", 2022);
        Book Book4 = new Book("1984", "George Orwell", 1949);

        User User1 = new User("Sara", 22);
        User User2 = new User("Heidi", 20);
        User User3 = new User("Michael", 23);
        User User4 = new User("Bob", 25);


        /*Book.setRating(4.5);
        Book.addReview("This is so good!");
        Book2.setRating(4.3);
        Book2.addReview("Everyone should read this.");
        Book3.setRating(4.2);
        Book3.addReview("What a book!");
        Book4.setRating(3.9);
        Book4.addReview("Just wow!");*/

        library.addUser(User1);
        library.addUser(User2);
        library.addUser(User3);
        library.addUser(User4);


        library.addBook(Book);
        library.addBook(Book2);
        library.addBook(Book3);
        library.addBook(Book4);
        library.displayBooks();
        // library.findBooksByAuthor("Hannah Grace");

       // library.updatedBooks();

        // library.returnBook(Book2);
        // library.updatedBooks();

        /*String book = "Iron Flame";

        System.out.println("\nIs \"" + book + "\" available? " + library.isBookAvailable(book));

        Book mostReviewedBook = library.getMostReviewedBook();

        System.out.println("\nAverage book rating: " + library.getAverageBookRating());
        System.out.println("\nMost reviewed book is " + mostReviewedBook.getTitle() +
                " with " + mostReviewedBook.getReviewCount() + " reviews. "); */

        User1.borrowBook(Book);
        User2.borrowBook(Book3);
        library.displayUsers();

    }
}
