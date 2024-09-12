package edu.misena.senaviewer;

public class Movie extends Film {
    private int timeViewed;

    // Constructor
    public Movie(String title, String genre, String creator, int duration, int year) {
        super(title, genre, creator, duration);
        this.setYear(year);
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    @Override
    public String toString() {
        return super.toString() + ", timeViewed=" + timeViewed;
    }
}
