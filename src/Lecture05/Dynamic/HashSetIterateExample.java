package Lecture05.Dynamic;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterateExample {
    public static void main(String[] args) {
        // Creating HashSet and adding elements
        HashSet<String> set = new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Two");
        set.add("Two");
        set.add("Two");
//        Iterator<String> myIterator = set.iterator();
//        while (myIterator.hasNext()) {
//            System.out.println(myIterator.next());
//        }
        for (String element : set) {
            System.out.println(element);
        }
        System.out.println(set.size());

    }
}
