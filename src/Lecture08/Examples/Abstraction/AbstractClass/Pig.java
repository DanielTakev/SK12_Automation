package Lecture08.Examples.Abstraction.AbstractClass;

// Subclass (inherit from Animal)
class Pig extends Animal {

    public void animalSound() {
        System.out.println("I am a piggie");
    }

    public void eat() {
        System.out.println("A pig eats");
    }
}