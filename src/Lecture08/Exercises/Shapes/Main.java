package Lecture08.Exercises.Shapes;

public class Main {
    public static void main(String[] args) {
        Circle circleShape1 = new Circle();
        System.out.println(circleShape1.getArea(3.0));
        System.out.println(circleShape1);

        Shape shape2 = new Circle(); // Upcast Circle to Shape
        System.out.println(shape2.getArea(3.0));
        System.out.println(shape2);

        Circle circleShapeCasted = (Circle)shape2; // Downcast back to Circle
        System.out.println(circleShapeCasted);
        System.out.println(shape2.getPerimeter(3.0));

        // Why is this invalid?
        // Square s4 = new Shape();

        Square square5 = new Square();
        System.out.println(square5.getArea(6.0));
        System.out.println(square5.getPerimeter(6.0));
    }
}
