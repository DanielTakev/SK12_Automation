package Lecture04.Statements;

public class IfStatement {
    public static void main(String[] args) {
        int num = 70;
        if (num > 100) {
            System.out.println("number is less than 100");
        }

        String myExpectedName = "Dani";
        // myActualName should be taken as user input, not hardcoded
        String myActualName = "Daniel";
        String comparisonWord = "";
        if (!(myExpectedName == myActualName)) {
            comparisonWord = "NOT ";
        }
        System.out.println("Your expected name (" + myExpectedName +
                ") is " + comparisonWord + "the same as the actual name (" + myActualName + ").");
    }
}
