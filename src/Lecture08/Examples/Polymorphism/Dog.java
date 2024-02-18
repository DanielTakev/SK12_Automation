package Lecture08.Examples.Polymorphism;

class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The dog says: baw baw");
    }
}