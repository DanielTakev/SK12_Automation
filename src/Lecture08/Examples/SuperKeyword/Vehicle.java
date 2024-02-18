package Lecture08.Examples.SuperKeyword;

class Vehicle {
    int vehicleID;
    String manufacturer;

    // First constructor of Vehicle class with parameters
    Vehicle(int vehicleID, String manufacturer) {
        this.vehicleID = vehicleID;
        this.manufacturer = manufacturer;
        System.out.println("Vehicle constructor with ID and manufacturer called.");
    }

    // Second constructor of Vehicle class with only ID parameter
    Vehicle(int vehicleID) {
        this(vehicleID, "Unknown"); // Call the first constructor with default manufacturer
        System.out.println("Vehicle constructor with only ID called.");
    }
}

class Car extends Vehicle {
    String model;

    // Constructor of Car class with parameters
    Car(int vehicleID, String manufacturer, String model) {
        super(vehicleID, manufacturer); // Calling superclass constructor with parameters
        this.model = model;
        System.out.println("Car constructor called.");
    }

    void display() {
        System.out.println("Vehicle ID: " + vehicleID + ", Manufacturer: " + manufacturer + ", Model: " + model);
    }
}

class VehicleDemo {
    public static void main(String[] args) {
        Car myCar = new Car(11011, "Lada", "Granta");
        myCar.display();
    }
}
