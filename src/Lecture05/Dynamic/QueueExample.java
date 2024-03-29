package Lecture05.Dynamic;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();
        System.out.println("1. Add elements to queue");
        pq.add("TestA");
        pq.add("TestB");
        pq.add("TestC");
        pq.add("TestD");
        pq.add("TestE");
        System.out.println(pq);

        System.out.println("2. Call remove method");
        pq.remove();
        System.out.println(pq);

        System.out.println("3. Iterate a queue");
        for (String eachElementInQueue : pq) {
            System.out.println(eachElementInQueue);
        }
    }
}
