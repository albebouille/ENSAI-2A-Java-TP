package fr.ensai.library;

import fr.ensai.library.Item;

/**
 * Represents a book.
 */
public class Magazine extends Item {

    // Attributes
    private String issn;
    private int issueNumber;

    /**
     * Constructs a new Book object.
     */
    public Magazine(String title, int year, int pageCount, String issn, int issueNumber) {
        super(title, year, pageCount);
        this.issn = issn;
        this.issueNumber = issueNumber;
    }

    public int getissueNumber() {
        return issueNumber;
    }

    @Override
    public String toString() {
        return "Magazine " + getTitle() + " numéro " + issueNumber;
    }
}
