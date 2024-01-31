package Lecture04.Statements;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your grade from 2 to 6: ");
        int i = scanner.nextInt();
        // Check the enhanced switch
        switch (i) {
            case 2:
                System.out.println("Grade is 2");
                break;
            case 3:
                System.out.println("Grade is 3");
                break;
            case 4:
                System.out.println("Grade is 4");
                break;
            case 5:
                System.out.println("Grade is 5");
                break;
            case 6:
                System.out.println("Grade is 6");
                break;
            default:
                System.out.println("Invalid Grade!");
        }
    }
}