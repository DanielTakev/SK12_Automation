package Lecture05.Dynamic;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();
        myHashMap.put(100, "Ivan");
        myHashMap.put(101, "Georgi");
        myHashMap.put(102, "Stoyan");
        System.out.println("1. Initial list of elements:");
        for (Map.Entry<Integer, String> eachElement : myHashMap.entrySet()) {
            System.out.println(eachElement.getKey() + " " + eachElement.getValue());
        }

        System.out.println("2. Updated list of elements ( replaced 102 key value ):");
        myHashMap.replace(102, "Pesho");
        // Map.Entry could be used without specifying the type
        for (Map.Entry eachElement : myHashMap.entrySet()) {
            System.out.println(eachElement.getKey() + " " + eachElement.getValue());
        }

        System.out.println("3. Updated list of elements ( replaced 101 key value ):");
        myHashMap.replace(101, "Georgi", "Anton");
        for (Map.Entry m : myHashMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("4. Updated list of elements ( replace all element values ):");
        myHashMap.replaceAll((k, v) -> "Asen");
        for (Map.Entry m : myHashMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
