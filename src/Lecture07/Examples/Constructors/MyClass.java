package Lecture07.Examples.Constructors;

public class MyClass {
    public int number;

    public MyClass() {
        this.number = 10;
    }

    public MyClass(int theNumber) {
        this.number = theNumber;
    }

    public int getTheNumber() {
        return this.number;
    }
}
