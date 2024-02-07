package Lecture06.Examples.Visibility;

public class Calculator {
    public static void main(String[] args) {
        double[] numbers = {3.4, 6.6, 5};
        double sum = MathOperations.getSumOfArrayOfDoubles(numbers);
        System.out.printf("%.2f", sum);
    }
}
