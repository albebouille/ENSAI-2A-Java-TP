package fr.ensai.library;

import fr.ensai.library.Author;
import fr.ensai.library.Book;
import fr.ensai.library.Magazine;
import fr.ensai.library.Library;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);

        Magazine m1 = new Magazine("Science Weekly", 2024, 50, "1234-5678", 5);
        Magazine m2 = new Magazine("Tech Monthly", 2024, 30, "9876-5432", 1);


        Library libraire = new Library( "libraire", new ArrayList<Item>() );
        libraire.loadBooksFromCSV("books.csv");

        libraire.addItem(m1);
        libraire.addItem(m2);

        libraire.displayItems();

        System.out.println(fellowshipOfTheRing.toString());
    }
}