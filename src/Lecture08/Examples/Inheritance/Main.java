package Lecture08.Examples.Inheritance;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Rav4", 4.4, 1.5, 2, 4);
        c.closeOpenDoor();
        c.honk();
    }
}
