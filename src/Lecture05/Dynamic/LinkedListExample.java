package Lecture05.Dynamic;

import java.util.LinkedList;

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

    }
}
