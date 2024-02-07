package Lecture05.Dynamic;

import java.util.HashSet;

public class HashSetMethods {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Niki");
        set.add("Ivan");
        set.add("Georgi");
        set.add("Stoyan");
        System.out.println("1. An initial list of elements: " + set);
        //Removing specific element from HashSet
        set.remove("Ivan");
        System.out.println("2. After invoking remove(Ivan) method: " + set);

        HashSet<String> someOtherHashSet = new HashSet<String>();
        someOtherHashSet.add("Ekaterina");
        someOtherHashSet.add("Maya");
        set.addAll(someOtherHashSet);
        System.out.println("3. Add set to another set: " + set);
        // Removing all the new elements from HashSet, based on another collection
        set.removeAll(someOtherHashSet);
        System.out.println("4. After invoking removeAll() method: " + set);

        // Removing elements on the basis of specified condition
        set.removeIf(eachElement -> eachElement.contains("Nik"));
        System.out.println("5. After invoking removeIf() method: " + set);

        // Removing all the elements available in the set and leaves it empty
        set.clear();
        System.out.println("6. After invoking clear() method: " + set);
    }
}
