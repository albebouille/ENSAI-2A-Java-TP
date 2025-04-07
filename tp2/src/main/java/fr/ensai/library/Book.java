package fr.ensai.library;

import fr.ensai.library.Item;
import fr.ensai.library.Author;

/**
 * Represents a book.
 */
public class Book extends Item {

    // Attributes
    private String isbn;
    private Author author;

    /**
     * Constructs a new Book object.
     */
    public Book(String isbn, String title, Author author, int year, int pageCount) {
        super(title, year, pageCount);
        this.isbn = isbn;
        this.author = author;
    }

    public Author getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        return "Book " + getTitle() + " written by " + author.toString();
    }

}
