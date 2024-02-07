package Lecture06.Examples;
// First example
public class CallMethodExample {

    protected static int myNum;

    private static int getIncreasedInteger(int value) {
        myNum = 10000;
        return ++value;
    }

    protected static void printHello() {
        System.out.println("Hello AUTO 12!");
    }

    private static void printSomething() {
        myNum = 5;
        int myNum2 = 55;
        System.out.println(myNum + myNum2);
    }

    public static void main(String[] args) {
        // One method can be called many times
        for (int i = 0; i <= 10; i++) {
            printHello();
        }
        int result = getIncreasedInteger(10);
        System.out.println(result);
    }
}
