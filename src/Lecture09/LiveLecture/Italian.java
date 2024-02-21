package Lecture09.LiveLecture;

public class Italian extends Person {

    private String EGN;
    public Italian(String name, char gender, String job, String egn, String religion) {
        super(name, gender, religion, "Italian", job, "Italian", egn, "Italy");
    }

    @Override
    public void sayHello() {
        System.out.println("Ciao!");
    }

    @Override
    public Boolean isAdult() {
        return this.age >= 18;
    }

    public void cookPizza() {
        System.out.println("I am cooking a pizza!");
    }
}
