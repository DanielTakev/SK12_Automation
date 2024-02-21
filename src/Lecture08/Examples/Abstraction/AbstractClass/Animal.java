package Lecture08.Examples.Abstraction.AbstractClass;

/*
* An abstract class in Java is a class meant to be subclassed,
* containing both abstract and concrete methods.
* A class can extend only one abstract class (abstract or not) but can implement multiple interfaces.
* */

/*
* An abstract class in Java is useful when you want to define a common structure and behavior for a group of related classes,
* but you don't want instances of the abstract class itself. For example, consider a shape hierarchy where you have abstract methods like calculateArea() and calculatePerimeter().
*
* Each specific shape (like Circle or Rectangle) can then implement these methods according to its own logic.
 */
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Animal Zzz");
    }
}
