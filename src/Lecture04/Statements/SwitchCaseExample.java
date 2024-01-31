package Lecture04.Statements;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your desired day of week: ");
        String dayOfWeek = scanner.nextLine();
        // Check the enhanced switch
        switch (dayOfWeek) {
            case "Friday":
                System.out.println(dayOfWeek);
                break;
            case "Saturday":
                System.out.println(dayOfWeek);
                break;
            case "Sunday":
                System.out.println(dayOfWeek);
                break;
            default:
                System.out.println("The day is not Friday, Saturday or Sunday! The day is " + dayOfWeek);
        }
    }
}