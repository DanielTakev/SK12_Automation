package Lecture08.Examples.Inheritance;

public class Main {
    public static void main(String[] args) {
        Car myNewCar = new Car("Toyota", "Rav4", 4.4, 1.5, 2, 4);
        myNewCar.closeOpenDoor();
        myNewCar.soundBeep();
    }
}
