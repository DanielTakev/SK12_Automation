package Lecture04.Loops;

public class BreakStatement {
    public static void main(String[] args) {
        int myNumber;
        for (myNumber = 100; myNumber >= 10; myNumber--) {
            System.out.println("myNumber: " + myNumber);
            if (myNumber == 91) {
                System.out.println("TADAAAA!!!");
                System.out.println("From Ivo!!!");

                break;
            }
        }
        System.out.println("Out of for-loop when myNumber is equal to: " + myNumber);
    }
}
