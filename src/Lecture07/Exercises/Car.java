package Lecture07.Exercises;


//Create a Car class which has 5 attributes name / color / release year / horsepower / second hand tick.
//        Name and color must be from string type / release year and horsepower to be integers / second hand is boolean.
//        Requirements:
//        • If name or color is not specified set N/A as value
//        • If release year or horsepower is not specified set -1 as value
//        • If second hand is not specified set false as value
//        Create a constructors of Car class for the following cases:
//        • Create a car by provided name / color / release year / horsepower / second hand
//        • Create a car by provided name / color / second hand
//        • Create a car by provided name / color / release year / horsepower
//        • Create a car by provided name / release year / horsepower / second hand
//        • Create a car by provided nothing
//        Create Car object using each constructor
public class Car {
    public String name;
    private String color;
    private int releaseYear;
    private int horsePower;

    public String getName() {
        return name;
    }

    public void setName(String alaBalaNica) {
        name = alaBalaNica;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public boolean isSecondHandTick() {
        return secondHandTick;
    }

    public void setSecondHandTick(boolean secondHandTick) {
        this.secondHandTick = secondHandTick;
    }

    private boolean secondHandTick;

    public Car(String name, String color, int releaseYear, int horsePower, boolean secondHandTick) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHandTick = secondHandTick;
    }

    public Car(String name, String color, boolean secondHandTick) {
        this(name, color, -1, -1, secondHandTick);
    }

    public Car(String name, String color, int releaseYear, int horsePower){
        this(name, color, releaseYear, horsePower, false);
    }

    public Car(String name, int releaseYear, int horsePower, boolean secondHandTick){
        this(name, "N/A", releaseYear, horsePower, secondHandTick);
    }

    public Car(int releaseYear, int horsePower, boolean secondHandTick){
        this("N/A", "N/A", releaseYear, horsePower, secondHandTick);
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", releaseYear=" + releaseYear +
                ", horsePower=" + horsePower +
                ", secondHandTick=" + secondHandTick +
                '}';
    }
}
