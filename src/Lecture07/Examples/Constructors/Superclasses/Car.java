package Lecture07.Examples.Constructors.Superclasses;

public class Car extends Vehicle {

    private String brand = null;

    public String getBrand() {
        return brand;
    }
    public Car(String brand, String regNo) {
        super(regNo);
        this.brand = brand;
    }
}
