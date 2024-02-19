package Lecture07.Examples.Exceptions;

public class NestedExceptionsExample {
    // Method to simulate throwing a runtime exception
    public static void throwRuntimeException() {
        System.out.println("Throwing a runtime exception...");
        throw new RuntimeException();
    }

    // Method that calls throwRuntimeException
    public static void callThrowRuntimeException() {
        throwRuntimeException();
    }

    public static void main(String[] args) {
        try {
            System.out.println("Starting execution...");
            // Call method that may throw an exception
            callThrowRuntimeException();
            // This line won't be executed if an exception occurs
            System.out.println("After calling method.");
        } catch (RuntimeException e) {
            // Handle the exception
            System.out.println("Caught a runtime exception.");
        } finally {
            // This block always executes, regardless of whether an exception occurred
            System.out.println("Finally block executed.");
        }
        // This line always executes, regardless of whether an exception occurred
        System.out.println("Execution continues...");
    }
}