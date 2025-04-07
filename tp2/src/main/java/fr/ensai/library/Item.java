package fr.ensai.library;

/**
 * Represents a item.
 */
public class Item {

    // Attributes
    private String title;
    private int year;
    private int pageCount;

    /**
     * Constructs a new Item object.
     */
    public Item(String title, int year, int pageCount) {
        this.title = title;
        this.year = year;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

}