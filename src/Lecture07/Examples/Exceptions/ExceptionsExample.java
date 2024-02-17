package Lecture07.Examples.Exceptions;
import java.io.*;

public class ExceptionsExample {
    public static void main(String[] args)  {
        // Invoking method testTryMultipleCatch with arguments 99 and "0"
        testTryMultipleCatch(99, "0");
    }

    // Method to handle a checked exception (FileNotFoundException)
    static void testFileNotFoundExceptionException() {
        try {
            File file = new File("src/Lecture07/Examples/Exceptions/file.txt");
            FileReader reader = new FileReader(file);
            System.out.println("FileReader does not throw exception.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!"); // Handling file not found exception
        }
    }

    // Method to cause an unchecked exception (ArrayIndexOutOfBoundsException)
    static void testArrayIndexOutOfBoundsException() {
        int[] num = {1, 2, 3, 4};
        // Accessing an index outside the bounds of the array
        System.out.println(num[5]);
    }

    // Method to cause an unchecked exception (StringIndexOutOfBoundsException)
    static void testStringIndexOutOfBoundsException() {
        try {
            String str = "Skillo";
            System.out.println(str.charAt(100)); // Accessing index beyond the length of the string
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("No such index"); // Handling string index out of bounds exception
        }
    }

    // Method to cause an unchecked exception (NullPointerException)
    static void testNullPointerException() {
        String str = null;
        System.out.println(str.length()); // Accessing length of null string
    }

    // Method demonstrating try-catch block for handling checked exception (FileNotFoundException)
    static void testTryCatch(String path) {
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found! Please check the file name and try it again!");
        }
    }

    // Method demonstrating try-catch block with multiple catch blocks for different exceptions
    static void testTryMultipleCatch(int number, String factorAsString) {
        try {
            int factor = Integer.parseInt(factorAsString);
            if (number % factor == 0)
                System.out.println(factor + " is a factor of " + number);
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic (my custom message): " + ex); // Handling arithmetic exception
        } catch (NumberFormatException ex) {
            System.out.println("Number Format Exception (my custom message): " + ex); // Handling number format exception
        }
    }

    // Method demonstrating try-catch block with multiple exceptions using a single catch block
    // To simulate an ArithmeticException, you should pass 0 as the factorAsString. This will cause a division by zero scenario when calculating number % factor.
    // To simulate a NumberFormatException, you should pass a non-numeric string or a string that cannot be parsed into an integer, such as "abc", "123abc", or "12.34", as the factorAsString. This will result in a failure to parse the string into an integer, triggering the NumberFormatException during the Integer.parseInt() operation.
    static void testTryCatchMultipleExceptions(int number, String factorAsString) {
        try {
            int factor = Integer.parseInt(factorAsString);
            if (number % factor == 0)
                System.out.println(factor + " is a factor of " + number);
        } catch (ArithmeticException | NumberFormatException ex) {
            System.out.println("Exception encountered " + ex); // Handling multiple exceptions using single catch block
        }
    }

    // Method declaring that it throws a checked exception (FileNotFoundException)
    static void testThrowsException(String path) throws FileNotFoundException {
        File file = new File(path);
        FileReader fileReader;
        fileReader = new FileReader(file);
    }

    // Method demonstrating try-finally block for resource cleanup
    static void testTryFinally(String path) throws IOException {
        FileInputStream fileInputSystem = null;
        BufferedReader inputStreamReader = null;
        try {
            fileInputSystem = new FileInputStream(path);
            inputStreamReader = new BufferedReader(new InputStreamReader(fileInputSystem));
            String temp;

            while ((temp = inputStreamReader.readLine()) != null) {
                System.out.println(temp);
            }
        } finally {
            if (inputStreamReader != null) {
                inputStreamReader.close(); // Closing BufferedReader in finally block
            }
            if (fileInputSystem != null) {
                fileInputSystem.close(); // Closing FileInputStream in finally block
            }
        }
    }
}
