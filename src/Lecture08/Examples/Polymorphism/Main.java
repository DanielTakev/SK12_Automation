package Lecture08.Examples.Polymorphism;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create a Animal object
        Animal myPig = new Pig(); // Create a Pig object
        Animal myDog = new Dog(); // Create a Dog object
        Dog mySecondDog = new Dog();

        // Create list of all animals created
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(myAnimal);
        animals.add(myPig);
        animals.add(myDog);
        animals.add(mySecondDog);

        for( Animal animal: animals) {
            animal.animalSound();
        }
    }
}

/*
--- Animal myDog = new Dog();:

- This creates an object of the Dog class and assigns it to a reference variable of type Animal.
- Since myDog is of type Animal, you can only access the methods and fields that are declared in the Animal class (or any superclass of Animal).
- However, if the Dog class overrides any methods from the Animal class, the overridden methods will be called based on the actual type of the object (dynamic dispatch).

--- Dog mySecondDog = new Dog();:

- This also creates an object of the Dog class but assigns it to a reference variable of type Dog.
- Since mySecondDog is of type Dog, you can access all the methods and fields that are declared in both the Dog class and its superclass(es).
- If there are any methods that are overridden in the Dog class, the overridden methods will always be called when invoked through mySecondDog.

*/