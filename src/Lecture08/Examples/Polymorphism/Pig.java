package Lecture08.Examples.Polymorphism;

class Pig extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The pig says: gruh gruh");
    }
}