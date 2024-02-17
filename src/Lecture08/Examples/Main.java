package Lecture08.Examples;

public class Main {
    public static void main(String[] args) {
        ClassExample myObject = new ClassExample();
        // We can get property value without getter method, but it is not a good practice!
        System.out.println("Main method call => Print property myMoneyNow: " + myObject.myMoneyNow);

        System.out.println("********");
        System.out.println("Print property myAge: " + ClassExample.myAge);
        ClassExample.printStaticHello();

        System.out.println("********");
        ClassExample myObject2 = new ClassExample();
        myObject2.printHelloOfObject();
    }
}
