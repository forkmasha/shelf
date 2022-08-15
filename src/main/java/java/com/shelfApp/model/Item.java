package java.com.shelfApp.model;

public class Item {

    public int id;

    public String name;
    public int pages;
    public boolean borrowed;

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
}
