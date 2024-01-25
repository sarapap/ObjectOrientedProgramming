package Module2.BookRatingsAndReviews;

public class Book {
    private String title;
    private String author;
    private int year;
    private double rating;
    private String review;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = 0;
        this.review = "";
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

    public double setRating(double rating) {
        return rating;
    }

    public String addReview(String review) {
        return review;
    }
}

