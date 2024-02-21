package Lecture08.Examples.Abstraction.Interface;
/*
* Interfaces, can only have method signatures and constants.
* Classes can extend one abstract class but implement multiple interfaces.
 */
public interface Animal {
    // interface method (does not have a body)
    public void animalSound();

    public void sleep();
    public void movement();
}
