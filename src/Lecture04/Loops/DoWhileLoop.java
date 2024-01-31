package Lecture04.Loops;

/*
Use a "do-while" loop when you want to ensure that the code inside the loop executes at least once,
 regardless of whether the loop condition is initially true or false.
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        int numberForIteration = 10;
        do {
            System.out.println("numberForIteration is equal to: " + numberForIteration);
            numberForIteration--;
        } while (numberForIteration > 3);
    }
}