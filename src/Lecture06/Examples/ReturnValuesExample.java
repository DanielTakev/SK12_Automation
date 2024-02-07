package Lecture06.Examples;

public class ReturnValuesExample {
    public static void main(String[] args) {
        int result1 = sumIntNumbers(5, 6);
        int result2 = sumIntNumbers(52, 2236);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result1 + result2);
    }

    static int sumIntNumbers(int x, int y) {
        System.out.println(x + y);
        return x + y;
    }
}
