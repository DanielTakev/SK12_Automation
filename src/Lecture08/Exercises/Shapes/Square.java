package Lecture08.Exercises.Shapes;

public class Square implements Shape {
    @Override
    public double getArea(double side) {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter(double side) {
        return 4 * side;
    }
}
