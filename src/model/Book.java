package model;

public class Book {

    private String title;
    private String releaseDate;
    private int bookId;
    private boolean isLent;

    public Book(String title, String releaseDate, int bookId, boolean isLent) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.bookId = bookId;
        this.isLent = isLent;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public boolean isLent() {
        return isLent;
    }

    public void setLent(boolean lent) {
        isLent = lent;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
