package fr.ensai.library;

import java.util.Objects;

/**
 * Represents a Student.
 */
public class Student extends Person {

    // Attributes
    private int academicYear;
    private boolean isClassDelegate;

    public Student(String name, int age, int academicYear, boolean isClassDelegate) {
        super(name, age); // Appelle le constructeur de Person
        this.academicYear = academicYear;
        this.isClassDelegate = isClassDelegate;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(int academicYear) {
        this.academicYear = academicYear;
    }

    public boolean isClassDelegate() {
        return isClassDelegate;
    }

    public void setClassDelegate(boolean classDelegate) {
        isClassDelegate = classDelegate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Student student = (Student) obj;
        return academicYear == student.academicYear &&
               Objects.equals(getName(), student.getName());
    }

    @Override
    public String toString() {
        return "Student " + getName() + ", Year: " + academicYear +
               ", Class Delegate: " + (isClassDelegate ? "Yes" : "No");
    }
}
