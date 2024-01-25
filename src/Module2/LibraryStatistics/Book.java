package Module2.LibraryStatistics;

public class Book {
    private String title;
    private String author;
    private int year;
    private double rating;
    private String review;
    private int reviewCount;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = 0;
        this.review = "";
        this.reviewCount = 0;
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

    public double getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public void setRating(double newRating) {
        if (newRating >= 1 && newRating <= 5) {
            rating = newRating;
            reviewCount++;
        }
    }

    public void addReview(String newReview) {
        review = newReview;
        reviewCount++;
    }

}
