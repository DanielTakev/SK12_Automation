package Lecture07.Examples.Constructors;

public class Employee {
     public String firstName;
     public String lastName;
     public int birthYear;

    public Employee(String fName, String lName, int bYear) {
        firstName = fName;
        lastName = lName;
        birthYear = bYear;
    }

    public Employee(String fName, String lName) {
        this(fName, lName, 2000);
    }

    public int getBirthYear() {
        return this.birthYear;
    }
}
