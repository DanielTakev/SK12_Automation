package Lecture08.Examples;

public class Main {
    public static void main(String[] args) {
//        ClassExample myNewObjectClassExample = new ClassExample();
//        // We can get property value without getter method, but it is not a good practice!
////        System.out.println("Main method call => Print property myMoneyNow: " + myNewObjectClassExample.myMoneyNow);
//
//        System.out.println("********");
//        System.out.println("Print property myAge: " + ClassExample.myAge);
//        ClassExample.printStaticMyAge();
//
//        System.out.println("********");
//        ClassExample mySecondObjectClassExample = new ClassExample();
//        mySecondObjectClassExample.printNonStaticMyProperties();

        // Multiple objects (try to use private field)
        ClassExample pesho1 = new ClassExample();
        pesho1.doubleMyMoney();
        ClassExample gosho2 = new ClassExample();

        System.out.println("First Pesho: " + pesho1.myMoneyNow);
        System.out.println("First Gosho: " + gosho2.myMoneyNow);
        gosho2.doubleMyMoney();
        gosho2.doubleMyMoney();
//        ClassExample.printHello();
        System.out.println("Pesho: " + pesho1.myMoneyNow);
        System.out.println("Gosho: " + gosho2.myMoneyNow);
    }
}
