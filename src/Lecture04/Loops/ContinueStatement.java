package Lecture04.Loops;

public class ContinueStatement {
    public static void main(String[] args) {
        int myNumber;
        for (myNumber = 0; myNumber <= 6; myNumber++) {
            if (myNumber == 4) {
//                System.out.println("ala bala");
                continue;
            }
            System.out.print(myNumber + " ");
        }
    }
}