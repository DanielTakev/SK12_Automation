package Lecture04.Statements;

import java.util.Scanner;

public class IfElseExample {

    /*
        A "statement" is a complete and individual instruction that performs a specific action
     */
    public static void main(String[] args) {
        int num = 100;
        int test = 0;
        if (num > 50) {
            test = 3;
            String testString = "fdfdf";
            System.out.println("TEST IF PRINT");
            if (num == 100) {
                test = 9999;
            }
        } else {
            test = 111;
            System.out.println("ELSE");
        }
        System.out.println("Test: " + test);
    }
}
