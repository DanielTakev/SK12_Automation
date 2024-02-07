package Lecture06.Examples;

public class MethodOverridingExample {
    public static void main(String[] args) {
        Dog sharo = new Dog();
        sharo.displayInfo();
    }
}

class Animal {
    public void displayInfo() {
        System.out.println("Parent class");
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
    public void displayInfo() {
        super.displayInfo();

        System.out.println("Child class");
        System.out.println("I am a dog.");
    }
}