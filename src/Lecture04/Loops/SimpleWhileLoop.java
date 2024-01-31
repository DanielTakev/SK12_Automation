package Lecture04.Loops;

public class SimpleWhileLoop {
    public static void main(String[] args) {
        int i = 10;
        while (i > 2) {
            System.out.println(i);
            // I need some mechanism to exit the loop. In this case I decrease the value of `i`
            i--;
        }
    }
}