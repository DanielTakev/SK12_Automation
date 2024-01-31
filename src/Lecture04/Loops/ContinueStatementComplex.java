package Lecture04.Loops;

public class ContinueStatementComplex {
    
    public static void main(String[] args) {
        for (int myNumber = 0; myNumber <= 10; myNumber++) {
            if ((myNumber == 4) || (myNumber == 6) || (myNumber == 4) || (myNumber == 9)) {
                continue;
            }
            System.out.print(myNumber + " ");
        }
    }
}
