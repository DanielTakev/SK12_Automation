package Lecture09;

public class American extends Person {
    public American(String name, String sex, String job, String EGN, Religion religion) {
        super(name, sex, "English", job, "American", EGN, "USA", religion);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }

    @Override
    public Boolean isAdult() {
        return this.age >= 21;
    }

    public void watchAmericanFootball() {
        System.out.println("I am watching American Football");
    }
}
