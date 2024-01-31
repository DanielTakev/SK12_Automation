package Lecture04.Loops;

public class SimpleForLoop {
    public static void main(String[] args) {

        // Standard for loop
        for (int i = 10; i >= 4; i--) {
            System.out.println("The value of i is: " + i);
        }

        // Omitting Initialization
        System.out.println("Omitting Initialization");
        int j = 0;
        for (; j < 5; j++) {
            System.out.println("Iteration: " + j);
        }

        // Omitting Update
        for (int k = 0; k < 5;) {
            System.out.println("Iteration: " + k);
            k++;
        }

        // Omitting Initialization and Update
        int myNum = 0;
        for (; myNum < 5;) { // Assuming 'i' is initialized outside the loop
            System.out.println("Iteration: " + myNum);
            myNum++;
        }
    }
}