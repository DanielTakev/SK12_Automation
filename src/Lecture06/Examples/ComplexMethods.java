package Lecture06.Examples;
// Second example
public class ComplexMethods {
    public static void main(String[] args) {
        System.out.println("First run method checkAge: " + checkAgeIsValid(21));
        System.out.println("Second run method checkAge: " + checkAgeIsValid(11));
        System.out.println(" ************************* ");

        System.out.println("\nOutput of method registerUser with valid parameters: ");
        registerValidUser(25, "john_doe", true);

        System.out.println("\nOutput of method registerUser with invalid parameters: ");
        registerValidUser(17, "Dani", true);

        System.out.println("\nOutput of method registerUser with invalid parameters: ");
        registerValidUser(22, "Dani2", false);
        // Try to execute it with missing parameter
//        int otherNum = CallMethodExample.myNum;
    }

    // Create a checkAge() method with an integer variable called age
    static String checkAgeIsValid(int age) {
        // If age is less than 21, print "access denied"
        if (age < 21) {
            return "Access denied - You are not old enough!";

        // If age is greater than 18, print "access granted"
        } else {
            return "Access granted - You are old enough!";
        }
    }

    // Example of user registration method
    // Methods should not be too long and complex, they could be split
    static void registerValidUser(int age, String username, boolean agreedToTerms) {
        if (agreedToTerms) {
            if (age >= 18) {
                // Add it to the database with SQL query
                System.out.println("User " + username + " registered successfully!");
            } else {
                System.out.println("Sorry, user " + username + " must be at least 18 years old to register.");
            }
        } else {
            System.out.println("User " + username + " must agree to the terms and conditions to register.");
        }
    }
}
