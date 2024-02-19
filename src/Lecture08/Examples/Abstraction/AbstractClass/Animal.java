package Lecture08.Examples.Abstraction.AbstractClass;

// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Animal Zzz");
    }
}

