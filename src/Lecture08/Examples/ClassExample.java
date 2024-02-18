package Lecture08.Examples;

public class ClassExample {
    static int myAge = 15;
    int myMoneyNow = 38;

    public static void printStaticHello() {
        System.out.println("STATIC Hello! \nThis method can be called WITHOUT creating object of class ClassExample");
        System.out.println("The value of myAge is: " + myAge);
        // System.out.println("ERROR: Non-static field 'myMoneyNow' cannot be referenced from a static context " + myMoneyNow);
    }

    public void printHelloOfObject() {
        System.out.println("NON-STATIC Hello! \nThis method can be called only if you create an object of class ClassExample.");
        System.out.println("Non-static variables as myMoneyNow can be accessed ONLY by non-static (object) methods like this one.");
        System.out.println("Static variables as myAge can be accessed from both static and non-static methods.");
        System.out.println("The value of myAge is: " + this.myAge);
        System.out.println("The value of myMoneyNow is: " + this.myMoneyNow);
    }
}
