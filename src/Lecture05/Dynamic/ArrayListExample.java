package Lecture05.Dynamic;

import java.util.ArrayList;

/*
    Pros:
    Dynamic Sizing: Easily resizable, allowing for flexible storage of elements.
    Built-in Methods: Provides convenient methods for common operations like adding, removing, and accessing elements.
    Heterogeneous Data: Can store elements of different data types (via autoboxing).

    Cons:
    Memory Overhead: Consumes more memory than simple arrays due to its dynamic resizing capabilities.
    Slower Access: Access time is slower compared to arrays due to additional method calls and potential resizing.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        // String array
        ArrayList<String> cars = new ArrayList<>();
        cars.add("test1");
        cars.add("Trabant");
        cars.add("BMW");
        cars.add("Lada");
        cars.add("Moskvich");
        cars.add("Karuca");
        cars.set(2, "for index 2");
        System.out.println(cars.get(0));
        System.out.println(cars);

        // DIFFERENT TYPES EXAMPLE
        // Declare an ArrayList with a generic type (Object) to hold elements of different types
        ArrayList<Object> mixedList = new ArrayList<>();

        // Adding elements of different types
        mixedList.add("Hello, World!");
        mixedList.add(42);
        mixedList.add(3.14);
        mixedList.add(true);

        // Accessing elements
        for (Object element : mixedList) {
            System.out.println(element);
        }
    }
}

