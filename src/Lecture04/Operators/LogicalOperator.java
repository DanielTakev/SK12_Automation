package Lecture04.Operators;

public class LogicalOperator {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        // Binary operators: which require two operands
        System.out.println("b1 && b2: " + (b1 && b2));
        System.out.println("b1 || b2: " + (b1 || b2));
        System.out.println("!(b1 && b2): " + !(b1 && b2));
    }
}
