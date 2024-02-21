package Lecture09.LiveLecture;

public class American extends Person {

    public American(String name, char gender, String job, String egn, String religion) {
        super(name, gender, religion, "English", job, "American", egn, "USA");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }

    @Override
    public Boolean isAdult() {
        return this.age >= 18;
    }

    public void watchAmericanFootball() {
        System.out.println("I am watching American Football");
    }
}
