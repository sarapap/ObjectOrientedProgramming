package Module3.Library.Model;

public class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String toString() {
        return "\nTitle: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }

}
