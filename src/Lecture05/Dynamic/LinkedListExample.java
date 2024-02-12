package Lecture05.Dynamic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
    Pros:
    Dynamic Sizing: Easily resizable, allowing for flexible storage of elements.
    Efficient Insertions and Deletions: Adding or removing elements in the middle is faster compared to ArrayList.
    No Wasted Memory: Only allocates memory for elements, making it memory-efficient for dynamic structures.

    Cons:
    Slower Access: Access time is slower compared to ArrayList, especially for random access, due to traversing nodes.
    Higher Memory Overhead: Each element requires extra memory for node storage, leading to higher memory usage.
 */
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(0));
        System.out.println(" ************************** ");

        // Parse int to String
        LinkedList<Integer> intToStringList = new LinkedList<>();
        // Add some integers to the LinkedList
        intToStringList.add(10);
        intToStringList.add(20);
        intToStringList.add(30);

        // Parse integers to strings while iterating over the LinkedList
        System.out.println("Parsing integers to strings from LinkedList:");
        for (Integer number : intToStringList) {
            String str = Integer.toString(number);
            System.out.println(str);
        }

        // Change array types
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        // Convert ArrayList to LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);

        // Print elements of LinkedList
        System.out.println("LinkedList: " + linkedList);
    }
}
