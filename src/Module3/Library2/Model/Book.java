package Module3.Library2.Model;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean reserved = false;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean b) {
        this.reserved = b;

    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "\nTitle: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }
}
