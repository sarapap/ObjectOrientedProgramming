package Module2.BookBorrowingSystem;

public class Book1 {
    private String title;
    private String author;
    private int year;

    public Book1(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}
