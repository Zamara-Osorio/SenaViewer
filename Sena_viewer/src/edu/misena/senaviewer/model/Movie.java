package edu.misena.senaviewer.model;

public class Movie extends Film {
    private int timeViewed;

    // Constructor
    public Movie(String title, String genre, String creator, int duration, int year) {
        super(title, genre, creator, duration);
        setYear(year);
    }

    // Getters and Setters
    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    // toString() Method
    @Override
    public String toString() {
        return "Movie{" +
                super.toString() +
                ", timeViewed=" + timeViewed +
                '}';
    }
}
