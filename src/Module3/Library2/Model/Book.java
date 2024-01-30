package Module3.Library2.Model;

public class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public boolean reserved() {
        return false;
    }

    public String toString() {
        return "\nTitle: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }

}
