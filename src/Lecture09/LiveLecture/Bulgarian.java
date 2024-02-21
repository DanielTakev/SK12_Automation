package Lecture09.LiveLecture;

public class Bulgarian extends Person {

    public Bulgarian(String name, char gender, String job, String religion, String egn) {
        super(name, gender, religion, "Bulgarian", job, "Bulgaria", egn, "Bulgaria");
    }

    @Override
    public void sayHello() {
        System.out.println("Здрастиииии!");
    }

    @Override
    public Boolean isAdult() {
        return this.age >= 18;
    }

    public void danceHoro() {
        System.out.println("Аз танцувам хоро!");
    }
}


