package Lecture07.Examples.Exceptions;

public class NestedExceptionsExample {
    public static void throwIt() throws RuntimeException {
        System.out.println("throw it");
        throw new RuntimeException();
    }

    public static void notThrowit() {
        throwIt();
    }

    public static void main(String[] args) {
        try {
            System.out.println("hello");
            notThrowit();
        } catch (Exception e) {
            System.out.println("caught");
        } finally {
            System.out.println("finally");
        }
        System.out.println("after");
    }
}
