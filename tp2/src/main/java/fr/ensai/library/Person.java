package fr.ensai.library;

import java.util.Objects;


/**
 * Represents a Person.
 */
public class Person {

    // Attributes
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
}