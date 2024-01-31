package Lecture04.Operators;

public class TernaryOperator {
    public static void main(String[] args) {
        /* Ternary operators: which require three operands
           Example: variable num1 = (condition) ? expression if true : expression if false
                - The first operand is the condition.
                - The second operand is the "expression if true" that follows the ? (question mark).
                - The third operand is the "expression if false" that follows the : (colon).
         */

        int num1, num2;
        num1 = 25;
        /* num1 is not equal to 10 that's why
         * the second value after colon is assigned
         * to the variable num2
         */
        num2 = (num1 == 10) ? 100 : 200;
        System.out.println("num2: " + num2);

        /* num1 is equal to 25 that's why
         * the first value is assigned
         * to the variable num2
         */
        num2 = (num1 == 25) ? 100 : 200;
        System.out.println("num2: " + num2);

        int score = 75;
        // Using ternary operator to determine a message based on the score
        String resultMessage = (score >= 60) ? "Pass" : "Fail";
        System.out.println("Result: " + resultMessage);
    }
}