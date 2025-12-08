package model;

public class Book {

    private String title;
    private int releaseYear;
    private int releaseMonth;
    private int releaseDay;
    private boolean isLent;

    public Book(String title, int releaseYear, int releaseMonth, int releaseDay) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.releaseMonth = releaseMonth;
        this.releaseDay = releaseDay;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public int getReleaseDay() {
        return releaseDay;
    }

    public boolean isLent() {
        return isLent;
    }

    public void setLent(boolean lent) {
        isLent = lent;
    }
}
