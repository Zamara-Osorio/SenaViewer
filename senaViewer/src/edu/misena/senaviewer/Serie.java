package edu.misena.senaviewer;

public class Serie extends Film {
    private int sessionQuantity;

    // Constructor
    public Serie(String title, String genre, String creator, int duration) {
        super(title, genre, creator, duration);
    }

    public int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    @Override
    public String toString() {
        return super.toString() + ", sessionQuantity=" + sessionQuantity;
    }
}

