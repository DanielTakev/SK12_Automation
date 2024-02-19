package Lecture08.Examples;

public class ClassExample {
    static int myAge = 17;
    int myMoneyNow = 38;

    public static void printStaticMyAge() {
        System.out.println("STATIC! \nThis method can be called WITHOUT creating object of class ClassExample");
        System.out.println("The value of myAge is: " + myAge);
//        System.out.println("ERROR: Non-static field 'myMoneyNow' cannot be referenced from a static context " + myMoneyNow);
    }

    public void printNonStaticMyProperties() {
        System.out.println("NON-STATIC! \nThis method can be called only if you create an object of class ClassExample.");
        System.out.println("Non-static variables as myMoneyNow can be accessed ONLY by non-static (object) methods like this one.");
        System.out.println("Static variables as myAge can be accessed from both static and non-static methods.");
        System.out.println("The value of myAge is: " + this.myAge);
        System.out.println("The value of myMoneyNow is: " + this.myMoneyNow);
    }

    public static void printHello() {
        System.out.println("Hello. This method can be called WITHOUT creating object of class ClassExample");
    }

    public int doubleMyMoney() {
        return this.myMoneyNow = this.myMoneyNow * 2;
    }

}
