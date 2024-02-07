package Lecture06.Examples;

public class MethodOverloading {
    public static void main(String[] args) {
        int sumTwoIntegers = sumNumbers(8, 5, 1);
        // Не всяко десетично число може да бъде представено коректно като крайна сума на степени на двойката, затова резултатът е такъв
        double sumTwoDoubles = sumNumbers(4.3, 6.26); // 10.56

        System.out.println("int: " + (sumTwoIntegers));
        System.out.printf("%.2f", sumTwoDoubles);
    }

    static int sumNumbers(int x, int y, int z) {
        return x + y + z;
    }
    static double sumNumbers(double x, double y) {
        return x + y;
    }
}
