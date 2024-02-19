package Lecture08.Examples.Inheritance;
/*
When a Vehicle object is created, it initializes the brand, model, length, width, and weight attributes with the values passed as parameters.
super() Call: There's no explicit call to super() because Vehicle doesn't extend any other class.
However, it implicitly calls the default constructor of the Object class, which is the superclass of all classes in Java.
 */
public class Vehicle {
    String brand;
    String model;
    double length;
    double width;
    double weight;
    int horsePower;
    int maxSpeed;

    Vehicle(String brand, String model, double length, double width, double weight) {
        this.brand = brand;
        this.model = model;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    protected void soundBeep() {
        System.out.println("Vehicle beep beep");
    }
}