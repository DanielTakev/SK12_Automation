package Lecture08.Examples.Inheritance;

/*
When a Car object is created, it first calls the constructor of its superclass Vehicle using super(brand, model, length, width, weight).
This initializes the inherited attributes from the Vehicle class. Then it initializes the numberOfDoors attribute with the value passed as a parameter.
super() Call: The super(brand, model, length, width, weight) call ensures that the superclass constructor is invoked before the subclass constructor's code is executed.
This is necessary because the superclass Vehicle does not have a default (no-argument) constructor, so you must explicitly call the superclass constructor with the appropriate arguments.
 */
public class Car extends Vehicle {
    private int numberOfDoors;
    private boolean doorClosed = true;

    Car(String brand, String model, double length, double width, double weight, int numberOfDoors) {
        super(brand, model, length, width, weight);
        this.numberOfDoors = numberOfDoors;
    }

    public void closeOpenDoor() {
        this.doorClosed = !doorClosed;

        if (this.doorClosed) {
            System.out.println("The door is closed");
        } else {
            System.out.println("The door is opened");
        }
    }
}