package Lecture08.Examples.KitchenExample;

public class Main {
    public static void main(String[] args) {
        Waiter waiter2 = new Waiter("Female", "Lucy");
        System.out.println("Waiter2: ");
        waiter2.setSeniorityLevel("Senior");
        System.out.println(waiter2.getGender());
        System.out.println(waiter2.getName());
        System.out.println(waiter2.getSeniorityLevel());
        System.out.println(waiter2.getMinimalWage());

    }
}
