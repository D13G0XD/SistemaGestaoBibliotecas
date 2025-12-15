package model;

public class Book {

    protected String title;
    protected String releaseDate;
    protected int bookId;
    protected boolean status;

    public Book(String title, String releaseDate, int bookId) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.bookId = bookId;

    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }


    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "(" + title +
                ", " + releaseDate + ", " +
                bookId + ")";
    }
}
