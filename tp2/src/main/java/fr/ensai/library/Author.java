package fr.ensai.library;

import fr.ensai.library.Person;
import java.util.Objects;

/**
 * Represents an Author.
 */
public class Author extends Person {

    // Attributes
    private String nationality;

    public Author(String name, int age, String nationality) {
        super(name, age); // Appelle le constructeur de Person
        this.nationality = nationality;
    }

    public Author(String name){
        super(name, 666);
        this.nationality = "fdp";
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Author author = (Author) obj;
        return Objects.equals(getName(), author.getName());
    }

    /**
     * Returns a string representation of the author.
     */
    @Override
    public String toString() {
        return "Author " + getName() + ", Nationality: " + getNationality();
    }
}
