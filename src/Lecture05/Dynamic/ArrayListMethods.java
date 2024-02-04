package Lecture05.Dynamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo"); // Adding element in ArrayList
        cars.add("BMW");
        cars.add("Ford"); // index 2
        cars.add("Mazda"); // index 3
        cars.add("Alabala");
        cars.set(1, "Mercedes"); // Change element
        cars.remove(2); // Remove element
        System.out.println(cars);
        System.out.println("GET index 2: " + cars.get(2)); // Access element
        
        Collections.sort(cars); // Sorting ArrayList
        // Loop through ArrayList
        for (String eachElement : cars) {
            System.out.println(eachElement);
        }
    }
}
