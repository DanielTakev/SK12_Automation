package Lecture06.Examples.Visibility;

public class MathOperations {
     protected static double getSumOfArrayOfDoubles(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
