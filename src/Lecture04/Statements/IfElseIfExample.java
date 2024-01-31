package Lecture04.Statements;

public class IfElseIfExample {
    public static void main(String[] args) {
        int num = 999;
        if (num < 100 && num >= 1) {
            System.out.println("Num is between 1 and 99");
        } else if (num < 1000 && num >= 100) {
            System.out.println("Num is between 100 and 999");
        } else if (num < 10000 && num >= 1000) {
            System.out.println("Num is between 1000 and 9999");
        } else {
            System.out.println("Number is not between 1 & 9999");
        }
    }
}
